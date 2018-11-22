TITLE bubble sorting
PAGE 60,80

my_cs SEGMENT PARA 'code'
	  ORG 100h
	  ASSUME SS: my_cs, DS: my_cs, CS: my_cs
START:JMP MAIN
	  array DW 5, 1, 9, 0, 4, 2, 6, 10, 3, 7
	  n     DW 10
MAIN PROC NEAR	 
	 
	 MOV CX, n
	 SUB CX, 2
	 
	 XOR DI, DI
	  L2:PUSH CX
	  
		 MOV CX, n
		 SUB CX, 2
		 SUB CX, DI
		 
		 XOR SI, SI
		 
	  L3:MOV AX, array[SI]
		 CMP AX, array[SI+2]
		 JA L1
		 MOV BX, array[SI+2]
		 MOV array[SI+2], AX
		 MOV array[SI], BX
		 
	  L1:ADD SI,2
	     LOOP L3
		 INC DI
		 POP CX
	 LOOP L2

RET
MAIN ENDP
my_cs ENDS
END START
