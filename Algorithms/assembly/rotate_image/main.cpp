#include <windows.h>
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <iostream>
#include "image_processing.cpp"

using namespace std;

void sagaDondur(short n, int resim);
void solaDondur(short n, int resim);

int main(void) {
	int M, N, Q, i, j, k;
	bool type;
	int efile, islem;
	char resimadi[100], sonek[10];
	do {
		printf("Islem yapilacak resmin yolunu (path) giriniz:\n-> ");
		scanf("%s", &resimadi);
		system("CLS");
		efile = readImageHeader(resimadi, N, M, Q, type);
	} while (efile > 1);
	printf("%s\n", resimadi);
	int** resim = resimOku(resimadi);

	short *resimdizi;
	resimdizi = (short*)malloc(N*M * sizeof(short));

	for (i = 0; i < N; i++)
		for (j = 0; j < M; j++)
			resimdizi[i*N + j] = (short)resim[i][j];

	int resimadres = (int)resimdizi;

	do {
		system("CLS");
		printf("\t     ISLEMLER\n");
		printf("------------------------------------\n");
		printf("1)  Resmi saga dondur\n");
		printf("2)  Resmi sola dondur\n");
		printf("0)  Cikis\n\n");
		printf("\"%s\" yolundaki resim icin yapilacak islemi seciniz\n-> ", resimadi);
		scanf("%d", &islem);
	} while (islem > 2 || islem < 0);

	switch (islem) {
	case 0:
		exit(0);
	case 1:
		sagaDondur(N, resimadres);
		strcpy(sonek, "_sag.pgm");
		break;
	case 2:
		solaDondur(N, resimadres);
		strcpy(sonek, "_sol.pgm");
		break;
	default:
		strcpy(sonek, "_orj.pgm");
		break;
	}

	for (k = 0; k < N * M; k++) {
		j = k % N;
		i = k / N;
		resim[i][j] = (int)resimdizi[k];
	}

	string::size_type pos = string(resimadi).find_last_of(".");
	resimadi[pos] = '\0';
	strcat(resimadi, sonek);
	resimYaz(resimadi, resim, N, M, Q);
	printf("\nIslem basariyla tamamlandi :)\n\"%s\" yolunda resim olusturuldu.\n\n", resimadi);
	system("PAUSE");
	return 0;
}

void sagaDondur(short n, int resim) {
	
	__asm {

		MOV EDI, resim
		XOR EAX, EAX // we will do some additions with EAX, so let's make sure that EAH is zero.

		//let's get the transpose of the image
			// the outer loop variable "j" will be stored in BX.
			// the inner loop variable "i" will be stored in SI.			
			XOR BX, BX
			MOV CX, n // cx=n
			L2 : PUSH CX
				 MOV SI, BX // i=j
				 MOV CX, n
				 SUB CX, BX // cx=n-j

				 L1 : PUSH CX // we will use CL to shift EBX.

					  MOV AX, n
					  MUL SI // dx:ax=i*n
					  PUSH BX // to protect the loop variable(j)
					  MOV BX, DX
					  MOV CL, 16
					  SHL EBX, CL
					  MOV BX, AX // at the end of 4 operations, EBX=i*n
					  POP AX // now AX=BX(j)
					  ADD EBX, EAX // EBX=i*n+j
					  ADD EBX, EBX // EBX=2*(i*n+j)

					  MOV ECX, EBX // let's store the index of matrix[i][j] in ECX.

					  MOV BX, AX // we will do some operations with ax so let's store the loop variable(j) in bx.
					  MOV AX, n
					  MUL BX // dx:ax=n*j
					  PUSH BX // to protect the loop variable(j)
					  MOV BX, DX
					  PUSH CX // to protect of the low part of ECX. We will shift the ECX.
					  MOV CL, 16
					  SHL EBX, CL // cl=16
					  MOV BX, AX // at the end of 4 operations, EBX=j*n
					  POP CX //...
					  MOV AX, SI // EAX=i
					  ADD EBX, EAX // EBX=j*n+i
					  ADD EBX, EBX // EBX=2*(j*n+i)

					  MOV DX, WORD PTR[EDI + EBX]
					  XCHG WORD PTR[EDI + ECX], DX
					  MOV WORD PTR[EDI + EBX], DX // at the of 3 operations, we swaped two members of the array.

					  POP BX // BX=j
					  INC SI
					  XOR ECX, ECX // we used the ECX in the different operations, EACH has some value, we have to reset it before using it!
					  POP CX
					  LOOP L1
					  INC BX
					  XOR ECX, ECX // it is described above.
					  POP CX
					  LOOP L2
					  //transpose ends

		//now, let's swap the columns to turn right the image!
			// the outer loop variable "j" will be stored in BX.
			// the inner loop variable "i" will be stored in SI.
			XOR BX, BX
			MOV CX, n
			SHR CX, 1 // CX=n/2
			L4: PUSH CX
				XOR SI, SI
				MOV CX, n // CX=n
				L3 : PUSH CX // we will use CL to shift EBX.
					 MOV AX, n
					 MUL SI // dx:ax=i*n
					 PUSH BX // to protect the loop variable(j).
					 MOV BX, DX
					 MOV CL, 16
					 SHL EBX, CL
					 MOV BX, AX // now, ebx=i*n

					 POP AX // ax stores the loop variable(j).
					 ADD EBX, EAX // ebx=i*n+j
					 ADD EBX, EBX // ebx=2*(i*n+j)

					 PUSH BX // to push EBL
					 MOV BX, AX // BX=j, because we will use ax.
					 MOV AX, n
					 MUL SI // dx:ax=i*n
					 SHL EDX, CL // cl=16
					 MOV DX, AX // edx=i*n
					 MOV AX, n
					 ADD EDX, EAX // edx=i*n+n
					 MOV AX, BX // ax=j
					 SUB EDX, EAX // edx=i*n+n-j
					 DEC EDX // edx=i*n+(n-1)-j
					 ADD EDX, EDX // 2*(edx=i*n+(n-1)-j)

					 POP BX // ebx still holds 2*(i*n+j).
					 PUSH AX // to protect the loop variable(j).

					 MOV AX, WORD PTR[EDI + EDX]
					 XCHG WORD PTR[EDI + EBX], AX
					 MOV WORD PTR[EDI + EDX], AX

					 POP BX // again BX=j
					 INC SI
					 XOR ECX, ECX // we used the ECX in the different operations, EACH has some value, we have to reset it before calling POP CX!
					 POP CX
					 LOOP L3
					 INC BX
					 XOR ECX, ECX
					 POP CX
					 LOOP L4
					 //the swapping the columns ends here!	

	}
	
}

void solaDondur(short n, int resim) {
	
	__asm {
		MOV EDI, resim
		XOR EAX, EAX // we will do some additions with EAX, so let's make sure that EAH is zero.

		//let's get the transpose of the image
			// the outer loop variable "j" will be stored in BX.
			// the inner loop variable "i" will be stored in SI.			
			XOR BX, BX
			MOV CX, n // cx=n
			L2 : PUSH CX
				 MOV SI, BX // i=j
				 MOV CX, n
				 SUB CX, BX // cx=n-j

				 L1 : PUSH CX // we will use CL to shift EBX.

					  MOV AX, n
					  MUL SI // dx:ax=i*n
					  PUSH BX // to protect the loop variable(j)
					  MOV BX, DX
					  MOV CL, 16
					  SHL EBX, CL
					  MOV BX, AX // at the end of 4 operations, EBX=i*n
					  POP AX // now AX=BX(j)
					  ADD EBX, EAX // EBX=i*n+j
					  ADD EBX, EBX // EBX=2*(i*n+j)

					  MOV ECX, EBX // let's store the index of matrix[i][j] in ECX.

					  MOV BX, AX // we will do some operations with ax so let's store the loop variable(j) in bx.
					  MOV AX, n
					  MUL BX // dx:ax=n*j
					  PUSH BX // to protect the loop variable(j)
					  MOV BX, DX
					  PUSH CX // to protect of the low part of ECX. We will shift the ECX.
					  MOV CL, 16
					  SHL EBX, CL // cl=16
					  MOV BX, AX // at the end of 4 operations, EBX=j*n
					  POP CX
					  MOV AX, SI // EAX=i
					  ADD EBX, EAX // EBX=j*n+i
					  ADD EBX, EBX // EBX=2*(j*n+i)

					  MOV DX, WORD PTR[EDI + EBX]
					  XCHG WORD PTR[EDI + ECX], DX
					  MOV WORD PTR[EDI + EBX], DX // at the of 3 operations, we swaped two members of the array.

					  POP BX // BX=j
					  INC SI
					  XOR ECX, ECX // we used the ECX in the different operations, EACH has some value, we have to reset it before using it!
					  POP CX
					  LOOP L1
					  INC BX
					  XOR ECX, ECX // it is described above.
					  POP CX
					  LOOP L2
					  //transpose ends

					  //now, let's swap the rows to turn left the image!
						  // the outer loop variable "j" will be stored in BX.
						  // the inner loop variable "i" will be stored in SI.
						  XOR SI, SI
						  MOV CX, n
						  SHR CX, 1 // cx=n/2
						  L4:PUSH CX
							 XOR BX, BX
							 MOV CX, n
							 L3 : PUSH CX // We will use CL to swap EBX.
								  MOV AX, n
								  MUL SI // dx:ax=i*n
								  PUSH BX // to protect the loop variable (j).
								  MOV BX, DX
								  MOV CL, 16
								  SHL EBX, CL
								  MOV BX, AX // ebx=i*n
								  POP AX // AX=j
								  ADD EBX, EAX
								  ADD EBX, EBX // ebx=2*(i*n+j)

								  MOV ECX, EBX
								  PUSH CX
								  MOV CX, AX // now CX=j

								  MOV AX, n
								  MOV BX, n
								  SUB BX, SI
								  DEC BX // bx=(col-1)-i
								  MUL BX // dx:ax=n*[(col-1)-i]
								  MOV BX, DX
								  PUSH CX
								  MOV CL, 16
								  SHL EBX, CL
								  MOV BX, AX // ebx=n*[(col-1)-i]
								  POP CX
								  MOV AX, CX
								  ADD EBX, EAX
								  ADD EBX, EBX
								  MOV AX, CX // ax=j
								  POP CX

								  MOV DX, WORD PTR[EDI + EBX]
								  XCHG WORD PTR[EDI + ECX], DX
								  MOV WORD PTR[EDI + EBX], DX

								  MOV BX, AX
								  INC BX
								  XOR ECX, ECX
								  POP CX
								  LOOP L3
								  INC SI
								  XOR ECX, ECX
								  POP CX
								  LOOP L4
								  //the swapping the rows ends here!	

	}
}
