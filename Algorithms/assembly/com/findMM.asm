PAGE 60, 80
TITLE find max and min element in a array

my_code SEGMENT PARA 'code'
	    ORG 100h
		ASSUME SS: my_code, CS: my_code, DS: my_code
START:  JMP MAIN
		maxValue DB ?
		minValue DB ?
		array    DB 6, 120, -52, 119, -65, 0, 23, 45, -97, 100
		n        DB 10		
MAIN    PROC NEAR		

		XOR SI, SI
		MOV BH, array[SI]
		MOV BL, array[SI]
		MOV CL, n
		DEC CX					;to ignore the first element				
		
		
	L3 :INC SI     
	    CMP array[SI], BH
		JL L1
		MOV DL, array[SI]
		XCHG array[SI], BH
		MOV array[SI], DL
		JMP L2
		
	L1 :CMP array[SI], BL
		JG L2
		MOV DL, array[SI]
		XCHG array[SI], BL
		MOV array[SI], DL
		
	L2 :LOOP L3
	
	MOV minValue, BL
	MOV maxValue, BH


RET
MAIN ENDP
my_code ENDS
END START
		
