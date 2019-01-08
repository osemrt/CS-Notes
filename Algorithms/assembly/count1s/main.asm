EXTRN COUNT_DIVIDE : FAR
myss SEGMENT STACK PARA 'stack'
	 DW 20 DUP(?)
myss ENDS

myds SEGMENT PARA 'data'
	 arr DW 64, 10, -9, 0, 6
	 n   DW 5
myds ENDS

mycs SEGMENT PARA PUBLIC 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX
	 
	 XOR SI, SI
	 MOV CX, n
L1:  PUSH arr[SI]
	 CALL COUNT_DIVIDE
	 MOV arr[SI], AX
	 ADD SI, 2
	 LOOP L1	 
	 
	 
	 RETF
MAIN ENDP
mycs ENDS
	 END MAIN