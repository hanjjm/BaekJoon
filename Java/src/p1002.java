1부터 100까지 짝수만 더하는 program

MOV R0, #0;
MOV R1, #100;
MOV R2, #2;
MOV R3, #0;

Loop:
JZ R1, Next;
ADD R0, R1;
SUB R1, R2;
JZ R3, Loop;