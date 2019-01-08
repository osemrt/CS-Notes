PUBLIC COUNT
mycs  SEGMENT PARA PUBLIC 'code'
	  ASSUME CS: mycs
COUNT PROC FAR
	  PUSH BP
	  PUSH BX
	  PUSH CX
	  PUSH DX	  
	  
	  XOR AX, AX   ; counter
	  MOV BP, SP
	  MOV BX, [BP+16] ; BX<-&arr
	  MOV CX, [BP+14] ; CX<-n
	  MOV DX, [BP+12] ; DX<-number
	  
  L2: CMP DX, [BX]
	  JNZ L1
	  INC AX
  L1: ADD BX, 2
	  LOOP L2
	  
	  POP DX
	  POP CX
	  POP BX
	  POP BP	  
	  RETF 6
COUNT ENDP
mycs  ENDS
	  END