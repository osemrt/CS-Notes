my_ss SEGMENT STACK 'stack'
      DW 20 DUP(?)
my_ss ENDS

my_ds SEGMENT 'data'	
	  num1   DD 091AFFBC2h
	  num2   DD 0FEEB21AFh
	  result DQ 0h
	  
my_ds ENDS

my_cs SEGMENT 'code'
	  ASSUME SS: my_ss, DS: my_ds, CS: my_cs
	  
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, my_ds
	 MOV DS, AX
	 
	 MOV AX, WORD PTR[num1+0]
	 MOV DX, WORD PTR[num2+0]
	 
	 MUL DX
	 
		 MOV WORD PTR[result+0], AX
		 MOV WORD PTR[result+2], DX
	 	 
	 MOV AX, WORD PTR[num1+0]
	 MOV DX, WORD PTR[num2+2]
	 
	 MUL DX
	 
		 ADD WORD PTR[result+2], AX
		 ADC WORD PTR[result+4], DX
	 	 ADC WORD PTR[result+6], 0h
		 
	 MOV AX, WORD PTR[num1+2]
	 MOV DX, WORD PTR[num2+0]
	 
	 MUL DX
	 
		 ADD WORD PTR[result+2], AX
		 ADC WORD PTR[result+4], DX
		 ADC WORD PTR[result+6], 0h
	 
	 MOV AX, WORD PTR[num1+2]
	 MOV DX, WORD PTR[num2+2]
	 
	 MUL DX
		 
		 ADD WORD PTR[result+4], AX
		 ADC WORD PTR[result+6], DX	 
	 
	 
RETF
MAIN ENDP
my_cs ENDS
END MAIN
