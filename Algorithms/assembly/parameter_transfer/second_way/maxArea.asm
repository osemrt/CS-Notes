PUBLIC FINDAREA
subcs     SEGMENT PARA 'code'
		  ASSUME CS: subcs
FINDAREA  PROC FAR	
		  PUSH BP
		  PUSH BX
		  PUSH CX
		  PUSH DX
		  PUSH DI
		  
		  MOV BP, SP
		  XOR AX, AX
		  ADD AX, [BP+14]
		  ADD AX, [BP+16]
		  ADD AX, [BP+18]	
		  
		  SHR AX, 1  ;AX->u		
		  MOV BX, AX ;BX->u		  
		  MOV CX, AX ;CX->u		  
		  MOV DI, AX ;DI->u
		  
		  SUB BX, [BP+14]
		  SUB CX, [BP+16]
		  SUB DI, [BP+18]
		  
		  XOR DX, DX
		  
		  MUL BX
		  MUL CX
		  MUL DI
		  
		  POP DI
		  POP DX
		  POP CX
		  POP BX
		  POP BP	  

		  RETF 6
FINDAREA  ENDP
subcs     ENDS
	      END