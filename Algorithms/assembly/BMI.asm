my_ds SEGMENT PARA 'data'
	  min  dw 255
	  agir dw 30, 20, 50, 90, 85, 47, 59, 87, 21, 69
	  boy  dw 1 ,4  ,6  ,  1,  2,  3,  1,  4,  2, 6
	  vki  dw 10 dup(?)
	  n    dw 10
	  
my_ds ENDS

my_ss SEGMENT PARA STACK 'yigin'
	  DW 20 DUP(?)		
		
my_ss ENDS

my_cs SEGMENT PARA 'kod'
	  ASSUME CS: my_cs, SS: my_ss, DS: my_ds
MAIN  PROC FAR	  
	  
	  PUSH DS
	  XOR AX, AX
	  PUSH AX
	  MOV AX, my_ds
	  MOV DS, AX
	  
	  MOV CX, n
	  
	  LEA SI, agir
	  LEA DI, boy
	  
don:  XOR DX, DX
	  MOV AX, [DI]
	  MOV BX, [DI]
	  MUL BX
	  
	  MOV BX, AX
	  MOV AX, [SI]
	  
	  DIV BX
	  
	  CMP AX, min
	  JAE L1
	  MOV min, AX
L1 :  ADD SI,2
      ADD DI,2
	  LOOP don
	  
RETF
MAIN ENDP
my_cs ENDS
END MAIN
