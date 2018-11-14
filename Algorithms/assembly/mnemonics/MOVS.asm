my_ss SEGMENT PARA STACK 'my_ss'
	  DW 20 DUP(?) 	
my_ss ENDS

my_ds SEGMENT PARA 'my_ds'
	  
	  eskiyer  DB 10,55,7,5,6,1,4
	  yeniyer  DB 7 DUP(?)
	  
	  
my_ds ENDS



my_cs SEGMENT PARA 'my_cs'
	  ASSUME SS: my_ss, DS: my_ds, CS:my_cs
	  
MAIN PROC FAR
	 PUSH DS
	 XOR AX,AX
	 PUSH AX
	 MOV AX, my_ds
	 MOV DS, AX
	
	MOV AX, my_ds
	MOV ES, AX
	
	
	LEA SI, eskiyer
	LEA DI, yeniyer
	
	MOV CX,7
	
	CLD
		
	REP MOVSB
	



RETF
MAIN ENDP
my_cs ENDS
END	MAIN  
