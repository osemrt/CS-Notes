myss SEGMENT PARA STACK 'stack'
	 DW 20 DUP(?)
myss ENDS

myds SEGMENT PARA 'data'
	 dizi  DB 100 DUP(?)
	 FIRST DW 0
	 LAST  DW ?	 
	 N     DW 6
	 
	 CR    EQU 13
	 LF    EQU 10
	 
	 MSG1  DB CR,        'Dizini eleman sayisini giriniz: ', 0
	 MSG2  DB CR,LF,     'Dizinin elemanlarini giriniz!', 0
	 MSG3  DB CR,LF,     'Eleman: ', 0
	 MSG4  DB CR,LF,     'Siralanmis dizinin elemanlari...', 0
	 HATA  DB CR,LF,     'Lutfen verilen aralikta bir sayi giriniz! [-128,127] : ', 0	 
myds ENDS

mycs SEGMENT PARA 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX
     
	 CALL ELEMAN_SAYISI 
	 CALL ELEMANLARI_AL	 	 
	 CALL QUICKSORT
	 CALL ELEMANLARI_YAZ	 
	 RETF
MAIN ENDP


ELEMAN_SAYISI  PROC NEAR
			   MOV AX, OFFSET MSG1      																		 
			   CALL PUT_STR            																		     
			   CALL GETN               																		     
			   MOV N, AX																						
			   MOV LAST, AX																						 
			   DEC LAST ; last=n-1	 
			   RET
ELEMAN_SAYISI  ENDP


QUICKSORT      PROC NEAR 		
		       MOV SI, FIRST
		       CMP SI, LAST
     	       JGE QS_END
			   
			   ; partition
		       MOV BX, FIRST ; BX(i)
		       MOV DI, LAST	 ; DI(j)		   
			   
        QS_L1: CMP SI, DI
		       JGE QS_L5
			   
        QS_L2: MOV AL, dizi[BX] ; AL(pivot)
		       CMP dizi[SI], AL ; A[i]<=AL(pi)			   
		       JG QS_L3
		       
		       INC SI
		       JMP QS_L2
		       
        QS_L3: CMP dizi[DI], AL
		       JLE QS_L4
		       DEC DI
			   
		       JMP QS_L3
			   
        QS_L4: CMP SI, DI
		       JGE QS_L1
			   
		       MOV AL, dizi[SI]
		       XCHG AL, dizi[DI]
		       MOV dizi[SI], AL
		       JMP QS_L1
			   
			   
        QS_L5: MOV AL, dizi[BX]
		       XCHG AL, dizi[DI]
		       MOV dizi[BX], AL
			   
			    ; partition
				
		       PUSH DI
		       PUSH LAST
		       MOV LAST, DI
		       DEC LAST			   
		       CALL QUICKSORT
		       POP LAST
		       POP DI
		       MOV FIRST, DI
		       INC FIRST
		       CALL QUICKSORT		
       QS_END: RET	              				    	
QUICKSORT      ENDP


ELEMANLARI_AL PROC NEAR
			  PUSH CX
			  PUSH SI
			  PUSH AX
			  
			  MOV CX, N
			  XOR SI, SI
			  
			  MOV AX, OFFSET MSG2
			  CALL PUT_STR
			  
		 L1:  MOV AX, OFFSET MSG3
			  CALL PUT_STR
			  
			  CALL GETN		 
			  
			  MOV dizi[SI], AL			  
			  INC SI
			  LOOP L1
			  
			  
			  POP AX
			  POP SI
			  POP CX
			  RET
ELEMANLARI_AL ENDP


ELEMANLARI_YAZ PROC NEAR
			   PUSH CX
			   PUSH SI
			   PUSH AX
			   
			   MOV CX, N
			   XOR SI, SI
			   
			   MOV AX, OFFSET MSG4
			   CALL PUT_STR
			   			   
			   MOV AL, 10
			   CALL PUTC
			   MOV AL, 13
			   CALL PUTC
			   
		   L2: XOR AX, AX
			   CMP dizi[SI], 0 ; 
			   JL MINUS
			   MOV AL, dizi[SI]
			   CALL PUTN
			   MOV AL, ' ' 
			   CALL PUTC
			   JMP SON
	    MINUS: MOV AL, '-'
			   CALL PUTC
			   MOV AL, dizi[SI]
			   NEG AL
			   CALL PUTN
			   MOV AL, ' '
			   CALL PUTC			   
          SON: INC SI
			   LOOP L2
			   
			   POP CX
			   POP SI
			   POP AX			   
			   RET
ELEMANLARI_YAZ ENDP


GETC 		  PROC NEAR 
			  ;------------------------------------------------------------------------------------------------------------
			  ; Klavyeden basılan karekteri AL yazmacına alır ve ekranda gösterir. İşlem sonucunda sadece AL etkilenir.  
			  ;------------------------------------------------------------------------------------------------------------
			  MOV AH,1h
			  INT 21H
			  RET
GETC 		  ENDP

              
PUTC		  PROC NEAR 
			  ;------------------------------------------------------------------------------------------------------------
		      ; AL yazmacındaki değeri ekranda gösterir. DL ve AH değişiyor. 
			  ; AX ve DX yazmaçlarının değerleri korumak için PUSH/POP yapılır.
			  ;------------------------------------------------------------------------------------------------------------
			  PUSH AX
			  PUSH DX
			  MOV DL,AL
			  MOV AH,2
			  INT 21H
			  POP DX
			  POP AX
			  RET
PUTC		  ENDP

              
GETN		  PROC NEAR 
			  ;------------------------------------------------------------------------------------------------------------
			  ; Klavyeden basılan sayiyi okur, sonucu AX yazmacı üzerinden döndürür. 
			  ; DX: sayının işaretli olup olmadığını belirler. 1(+), -1(-) demek
			  ; BL: hane bilgisini tutar.
			  ; CX: okunan sayının işlenmesi sırasındaki ara değeri tutar.
			  ; AL: klavyeden okunan karekteri tutar (ASCII)
			  ; AX zaten dönüş değeri olarak değişmek durumundadır. Ancak diğer yazmaçların önceki değerleri korunmalıdır.
			  ;------------------------------------------------------------------------------------------------------------
			  PUSH BX
			  PUSH CX
			  PUSH DX
GETN_START:   MOV DX,1
			  XOR BX,BX
			  XOR CX,CX
NEW:		  CALL GETC
			  CMP AL,CR
			  JE FIN_READ
			  CMP AL, '-'
			  JNE CTRL_NUM
NEGATIVE:	  MOV DX,-1
			  JMP NEW
CTRL_NUM:	  CMP AL,'0'
			  JB ERROR
			  CMP AL,'9'
			  JA ERROR
			  SUB AL, '0'
			  MOV BL,AL
			  MOV AX,10
			  PUSH DX
			  MUL CX
			  POP DX
			  MOV CX,AX
			  ADD CX,BX
			  JMP NEW
ERROR:	      MOV AX, OFFSET HATA
			  CALL PUT_STR
			  JMP GETN_START
FIN_READ:     MOV AX, CX
		      CMP AH, 0
		      JNE ERROR
		      CMP DX, 1
		      JE label_getn1
		      CMP AL, 128
		      JA ERROR
		      JMP label_getn2
label_getn1:  CMP AL, 127
		      JA ERROR
label_getn2:  CMP DX, 1
			  JE FIN_GETN
			  NEG AX
FIN_GETN:     POP DX
			  POP CX
			  POP DX
			  RET
GETN   	      ENDP 
              
              
PUTN		  PROC NEAR 
			  ;------------------------------------------------------------------------------------------------------------
			  ; AX'de bulunan sayiyi onluk tabanda hane hane yazdırır.
			  ; CX: haneleri 10'a bölerek bulacağız, CX=10 olacak
			  ; DX: 32 bölmede işleme dahil olacak. Sonucu etkilemesin diye 0 olmalı
			  ;------------------------------------------------------------------------------------------------------------
			  PUSH CX
			  PUSH DX
			  XOR DX,DX
			  PUSH DX
			  MOV CX,10
			  CMP AX,0
			  JGE CALC_DIGITS
			  NEG AX
			  PUSH AX
			  MOV AL, '-'
			  CALL PUTC
			  POP AX
CALC_DIGITS:  DIV CX
			  ADD DX, '0'
		      PUSH DX
		      XOR DX, DX
		      CMP AX, 0
		      JNE CALC_DIGITS
DISP_LOOP:	  POP AX
			  CMP AX,0
			  JE END_DISP_LOOP
			  CALL PUTC
			  JMP DISP_LOOP
END_DISP_LOOP:POP DX
			  POP CX
			  RET
PUTN		  ENDP


PUT_STR	PROC NEAR 
			  ;------------------------------------------------------------------------------------------------------------
			  ; AX de adresi verilen sonunda 0 olan dizgeyi karekter karekter yazdırır.
			  ; BX dizgeye indis olarak kullanılır. Önceki değeri saklanmalıdır.
			  ;------------------------------------------------------------------------------------------------------------
			  PUSH BX
			  MOV BX,AX
			  MOV AL,BYTE PTR [BX]
PUT_LOOP:	  CMP AL,0
			  JE PUT_FIN
			  CALL PUTC
			  INC BX
			  MOV AL,BYTE PTR [BX]
			  JMP PUT_LOOP
PUT_FIN:      POP BX
			  RET
PUT_STR	ENDP


mycs ENDS
	 END MAIN
