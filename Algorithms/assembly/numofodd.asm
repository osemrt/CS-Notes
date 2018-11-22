my_ss SEGMENT STACK PARA 'stack'
	  DW 20 DUP(?)
my_ss ENDS

my_ds SEGMENT PARA 'data'
      array  DB 200 DUP(?)
	  n      DW 200
	  numodd DB 0
my_ds ENDS

my_cs SEGMENT PARA 'code'
	  ASSUME SS: my_ss, DS: my_ds, CS: my_ss
MAIN  PROC FAR
	  PUSH DS
	  XOR AX, AX
	  PUSH AX
	  MOV AX, my_ds
	  MOV DS, AX
	
	  
      XOR SI, SI	
	  MOV CX, n
	  
   L1:SHR array[SI],1
	  ADC numtek, 0
	  INC SI
	  LOOP L1
	
	  MOV BL, numodd
	  RETF
MAIN ENDP
my_cs ENDS
END MAIN
