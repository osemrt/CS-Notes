EXTRN arr: byte, n: word
PUBLIC SORT
subcs SEGMENT PARA 'code'
	  ASSUME CS: subcs
SORT  PROC FAR
	  PUSH SI
	  PUSH CX
	  
	  MOV CX, n
	  DEC CX
	  
	  XOR SI, SI
  L1: MOV AL, arr[SI+0]
	  MOV AH, arr[SI+1]
	  CMP SI, CX
	  JAE L_ex
	  CMP AH, AL
	  JLE L_ex
	  INC SI
	  JMP L1
	  
L_ex: CMP SI, CX
	  JNZ L2
	  MOV AL, 0
	  JMP ex
  L2: MOV AL, 1
	  
 ex:  POP CX
	  POP SI

      RETF
SORT  ENDP
subcs ENDS
	  END
	  