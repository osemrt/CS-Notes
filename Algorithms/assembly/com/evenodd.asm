my_cs SEGMENT PARA 'code'
	  ORG 100h
	  ASSUME SS: my_cs, CS: my_cs, DS: my_cs
START:JMP MAIN
	  
	  sumeven  DW 0
	  sumodd   DW 0
	  neven    DW 0
	  nodd     DW 0
	  avgeven  DW 0
	  avgodd   DW 0
	  array    DW 300 DUP(?)
	  n        DW 300
	  	  
	  MAIN PROC FAR
	  
	  LEA SI, dizi
	  MOV CX, n
	  
   L3:MOV BX, [SI]
	  TEST BX, 0001h
	  JZ L1
	  INC nodd
	  ADD sumodd, BX
	  JMP L2
   L1:INC neven
	  ADD sumeven, BX
   L2:ADD SI,2
      LOOP L3
   
      XOR DX, DX
	  MOV AX, sumeven
	  MUL neven
	  MOV avgeven, AX
	  
	  XOR DX, DX
	  MOV AX, sumodd
	  MUL nodd
	  MOV avgodd, AX
	  
	   
	  
RET
MAIN ENDP
my_cs ENDS
END START	  
