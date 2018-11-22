PAGE 60,80
TITLE find the temperature that is below -20 degree

my_cs SEGMENT PARA 'code'
	  ORG 100h
	  ASSUME SS: my_cs, CS: my_cs, DS: my_cs
START:JMP MAIN
	  array DB 25, 20, 36, -10, 0, -25
	  limit DB -20
	  n     DW 6
MAIN  PROC NEAR	  
	  
	  XOR SI, SI
	  MOV BL, limit
	  XOR AX, AX
	  
L2:	  CMP SI, n 
	  JZ L1
	  CMP array[SI], BL  
	  JL L1
	  INC SI
	  JMP L2

L1:   CMP SI, n
	  JZ L3
	  INC AX	  

L3 :  RET
MAIN ENDP
my_cs ENDS
END START
