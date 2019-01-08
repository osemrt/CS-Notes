PUBLIC COUNT_DIVIDE
mycs 		 SEGMENT PARA PUBLIC 'code'
			 ASSUME CS: mycs
COUNT_DIVIDE PROC FAR
			 PUSH BX
			 PUSH BP
			 PUSH DX
			 PUSH CX
			 			 
			 XOR BX, BX ; counter
			 MOV BP, SP
			 MOV CX, [BP+12] ; arr[SI]
			 MOV AX, CX
			 
		 L1: CMP CX, 0
			 JZ divide
			 SHR CX, 1
			 ADC BX, 0
			 JMP L1
			 
	 divide: CMP BX, 0
			 JZ exit
			 XOR DX, DX
			 IDIV BX
			 
	   exit: POP CX
			 POP DX
			 POP BP
			 POP BX			 
			 RETF 2
COUNT_DIVIDE ENDP
mycs 		 ENDS
			 END