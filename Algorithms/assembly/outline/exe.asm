myss SEGMENT PARA STACK 'stack'
	 DW 20 DUP(?)
myss ENDS

myds SEGMENT PARA 'data'
	
myds ENDS

mycs SEGMENT PARA 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX	 
	 .
	 .
	 .
	 .
	 .	 	 
	 RETF 
MAIN ENDP	
mycs ENDS
	 END MAIN