TITLE convert celsius to fahrenheit
TITLE 60, 80

my_ss SEGMENT STACK PARA 'stack'
	  DW 20 DUP(?)
my_ss ENDS

my_ds SEGMENT PARA 'data'
      celcius    DW -40
	  fahrenheit DW ?
my_ds ENDS

my_cs SEGMENT PARA 'code'
	  ASSUME SS: my_ss, DS: my_ds, CS: my_ss
MAIN  PROC FAR
	  PUSH DS
	  XOR AX, AX
	  PUSH AX
	  MOV AX, my_ds
	  MOV DS, AX
	
	  XOR DX, DX
	  MOV AX, 9
	  IMUL celcius
	  
	  MOV CX, 5
	  IDIV CX
	  
	  ADD AX, 32
	  	
	  RETF
MAIN ENDP
my_cs ENDS
END MAIN
