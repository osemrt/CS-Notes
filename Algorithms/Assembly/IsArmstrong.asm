
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h

; add your code here

        XOR SP,SP
        XOR AX,AX 
        XOR DI,DI 
        XOR BX,BX
        
        MOV SP,1633
        MOV AX,SP
        MOV BP,0
        MOV DI,10         
                 
                 
    L1: CMP AX,0            ; while loop starts
        JZ L3                                
        
        DIV DI
        MOV BX,DX
        
        PUSH AX
        
        MOV AX,BX
        
        MUL BX
        MUL BX
        MUL BX
        
        ADD BP,AX
        
        POP AX
        
        LOOP L1             ; while loop ends
        
        
    L3: CMP SP,BP
        JZ L2
        MOV SI,0
        jmp END             ; sona atla          
    L2: MOV SI,1        
    END:              
        
                       
         
        
        


ret 
