; sequential three members in the array are a triangle. 
; Find the max area in another function by using heron's formula 

EXTRN FINDAREA : FAR
myss SEGMENT STACK PARA 'stack'
	 DW 20 DUP(?)
myss ENDS

myds SEGMENT PARA 'data'
	 arr DW 6, 5, 5, 3, 4, 5, 2, 3, 4
	 n   DW 3
	 max DW 0
myds ENDS

mycs SEGMENT PARA 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX
	 
	 MOV CX, n
	 XOR SI, SI
	 
 L1: PUSH arr[SI+0]
	 PUSH arr[SI+2]
	 PUSH arr[SI+4]
	 CALL FINDAREA
	 CMP max, AX
	 JAE L2
	 MOV max, AX	 
 L2: ADD SI, 6
	 LOOP L1
	 
	 RETF
MAIN ENDP	 
mycs ENDS
	 END MAIN