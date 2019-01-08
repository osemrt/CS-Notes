mycs SEGMENT PARA 'code'
	 ORG 100h
	 ASSUME SS: mycs, DS: mycs, CS: mycs
	 JMP MAIN
	 ... DB ...
	 ... DW ...
MAIN PROC FAR
	 .
	 .
	 .
	 .
	 .
	 .
	 .
	 .
	 RET
MAIN ENDP
mycs ENDS
	 END MAIN