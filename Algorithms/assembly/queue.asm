TITLE find the unwanted person in the queue
PAGE 60,80

my_ss SEGMENT PARA STACK 'stack'
	  DW 20 DUP (?)
my_ss ENDS

my_ds SEGMENT PARA 'data'	  
	   array   DB 16, 35, 49, 57, 19, 48, 19, 50, 10, 23, 55
	   result  DB ?	   
my_ds ENDS

my_cs SEGMENT PARA 'code'	         
      ASSUME SS: my_ss, CS: my_cs, DS: my_ds
MAIN PROC FAR
	  PUSH DS
	  XOR AX, AX
	  PUSH AX
	  MOV AX, my_ds
	  MOV DS, AX
	
XOR SI, SI
	 	 
L1:    MOV AL, array[SI]
	   CMP AL, 15
	   JB  L2
	   CMP AL, 55
	   JA  L2
	   INC SI
	   JMP L1
	  
L2:    RETF
MAIN ENDP
my_cs ENDS
END MAIN
