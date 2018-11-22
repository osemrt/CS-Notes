my_cs SEGMENT PARA 'code'
	  ORG 100h
	  ASSUME SS: my_cs, DS: my_cs, CS: my_cs
START:JMP MAIN
	  positive   DW 0
	  negative   DW 0
	  zero 		 DW 0
	  array 	 DW -10, 0, 20, -35, 65, 0, 40, 85, -94, -100, 0, 156
	  n     	 DW 12
	  MAIN PROC NEAR
	  
	  XOR SI, SI
	  MOV CX, n
	  
   L4:CMP array[SI], 0 ;check it
	  JZ L2
	  CMP array[SI], 0
	  JL L3
	  INC positive
	  JMP L1
   L2:INC zero
	  JMP L1
   L3:INC negative
   L1:INC SI
	  INC SI
      LOOP L4
	  	  
		  	  
RET
MAIN ENDP
my_cs ENDS
END START
