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
	 
	 MSG1  DB CR,        'N: ', 0
	 MSG2  DB CR,LF,     'Dizinin elemanlarını giriniz..', 0
	 MSG3  DB CR,LF,     'Eleman: ', 0
	 MSG4  DB CR,LF,     'Sıralanmış dizinin elemanları...', 0
	 HATA  DB CR,LF,     'sayi girmediniz yeniden giriniz : ', 0	 
myds ENDS

mycs SEGMENT PARA 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX
     
	 ;Kullanıcıdan dizinin eleman sayısını alıyoruz.------------------------------------------------------- |
	 MOV AX, OFFSET MSG1      																		       ;|
	 CALL PUT_STR            																		       ;|
	 CALL GETN               																		       ;|
	 MOV N, AX																							   ;|
	 MOV LAST, AX																						   ;|
	 DEC LAST																							   ;|
	 ;-------------------------------------------------------------------------------------------------------
	 
	  
	 CALL ELEMANLARI_AL	 	 
	 MOV DI, LAST
	 MOV SI, FIRST
	 CALL QUICKSORT
	 CALL ELEMANLARI_YAZ	 
	 RETF
MAIN ENDP


QUICKSORT      PROC NEAR			   
			   CMP DI, SI
			   JBE L3
			   
			   CALL PARTITION
			   
			   MOV SI, FIRST
			   MOV DI, BX
			   DEC DI			   
			   CALL QUICKSORT
			   
			   MOV DI, LAST
			   MOV SI, BX
			   INC SI
			   CALL QUICKSORT
			   ;MOV DI, LAST			   
			L3:
			   RET
QUICKSORT      ENDP


PARTITION      PROC NEAR
			   MOV DL, dizi[DI]
			   
			   MOV FIRST, SI
			   MOV LAST, DI
			   
			   MOV AX, DI
			   SUB AX, SI
			   MOV CX, AX
			   
			   MOV BX, SI
			   
		   L5: CMP DL, dizi[SI]
			   JLE L4
			   
			   MOV AL, dizi[BX]
			   MOV AH, dizi[SI]
			   MOV dizi[BX], AH
			   MOV dizi[SI], AL
			   
			   INC BX
		   L4: INC SI
			   LOOP L5
			   
			   MOV AL, dizi[DI]
			   MOV AH, dizi[BX]
			   MOV dizi[DI], AH
			   MOV dizi[BX], AL		
			   RET
PARTITION      ENDP


ELEMANLARI_YAZ PROC NEAR
			   MOV CX, N
			   XOR SI, SI
			   
			   MOV AX, OFFSET MSG4
			   CALL PUT_STR
			   MOV AL, 10
			   CALL PUTC
			   MOV AL, 13
			   CALL PUTC
			   
		   L2: XOR AH, AH
			   MOV AL, dizi[SI]
			   CALL PUTN
			   MOV AL, 31
			   CALL PUTC
			   INC SI
			   LOOP L2
			   RET
ELEMANLARI_YAZ ENDP


ELEMANLARI_AL PROC NEAR
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
			  RET
ELEMANLARI_AL ENDP


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
FIN_READ:	  MOV AX,CX
			  CMP DX,1
			  JE FIN_GETN
			  NEG AX
FIN_GETN:	  POP BX
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
