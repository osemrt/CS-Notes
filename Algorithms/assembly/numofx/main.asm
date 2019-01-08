; find the number of 'number' in the array.

EXTRN COUNT: FAR
myss SEGMENT STACK PARA 'stack'
	 DW 32 DUP (?)
myss ENDS

myds SEGMENT BYTE 'data'
	 arr     DW 12, 12, 12, 12, 12, 12, 13, 14, 15, 16, 17
	 n	     DW 11
	 number  DB 12
	 counter DW ?
myds ENDS

;*					*	    *  
mycs SEGMENT PARA PUBLIC 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX
	 
	 PUSH n
	 
	 LEA BX, arr
	 PUSH BX
	 
	 XOR DX, DX
	 MOV DL, number
	 PUSH DX
	 
	 CALL COUNT
	 MOV counter, AX	 

	 RET
MAIN ENDP
mycs ENDS	 
	 END MAIN