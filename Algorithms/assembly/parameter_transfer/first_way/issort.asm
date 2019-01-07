PUBLIC arr, n
EXTRN SORT:FAR
myss SEGMENT STACK PARA 'stack'
	 DW 20 DUP(?)
myss ENDS

myds SEGMENT PARA 'data'
	 arr  DB 12, 14, 16, 18, 20, 22, 24
	 n    DW 7
	 S    Db 0
myds ENDS

mycs SEGMENT PARA 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX
	 
	 CALL SORT
	 CMP AL, 0
	 JZ L1
	 MOV S, 1
	 
 L1: RETF
MAIN ENDP
mycs ENDS
	 END MAIN
