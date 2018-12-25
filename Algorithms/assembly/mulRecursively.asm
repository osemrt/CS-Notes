myss SEGMENT STACK PARA 'stack'
     DW 20 DUP (?)
myss ENDS

myds SEGMENT PARA 'data'
	 arr1 DB 0Dh, 18h, 1Fh, 0FBh, 28h, 0Bh, 01h, 34h, 14h, 0FFh 
	 arr2 DB 01h, 02h, 03h, 01Bh, 0Ah, 0Ah, 0FFh, 19h, 42h, 0FFh
	 arr3 DW 10 DUP(0)
	 n    DW 10
myds ENDS

mycs SEGMENT PARA 'code'
	 ASSUME SS: myss, DS: myds, CS: mycs
MAIN PROC FAR
	 PUSH DS
	 XOR AX, AX
	 PUSH AX
	 MOV AX, myds
	 MOV DS, AX
	 
	 XOR BX, BX
	 MOV CX, n
	 
 L1: XOR AX, AX
	 MOV AL, [BX+0]
	 PUSH AX
	 MOV AL, [BX+10]
	 PUSH AX	 
	 CALL FUNC
	 
	 SHL BX, 1
	 POP arr3[BX]
	 SHR BX,1
	 ADD BX,1
	 LOOP L1
	 RETF
MAIN ENDP


FUNC PROC NEAR
	 PUSH BP
	 PUSH BX
	 PUSH DX
	 
	 MOV BP, SP
	 MOV BX, [BP+8]
	 MOV DX, [BP+10]
	 CMP BX, 1
	 JNZ L2
	 MOV [BP+10], DX
	 JMP L3
	 
 L2: TEST BX, 0001h
	 JZ L4        
	 SHR BX, 1    
	 PUSH BX      
 	 MOV BX, DX   
	 SHL DX, 1
	 PUSH DX
	 CALL FUNC
	 
	 POP [BP+10]
	 ADD [BP+10], BX
	 JMP L3
 L4: SHR BX, 1
	 SHL DX, 1
	 PUSH DX
	 PUSH BX
	 CALL FUNC
	 
	 POP [BP+10]
 L3: POP DX
	 POP BX
	 POP BP	 
	 RET 2
FUNC ENDP


mycs ENDS
	 END MAIN
