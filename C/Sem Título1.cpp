#include <stdio.h>
 main(){
	char homem;
	char mulher;
	printf("introduza um caractere: ");
	scanf("%c", &homem); // ler um %c (caractere) e a coloca na variavel homem
	printf("introduza um caractere: ");
	scanf(" %c", &mulher); // ler um %c (caractere) e a coloca na variavel mulher
	
	printf("\no usuario digitou %c, %c.\n",homem,mulher);
	// substitui o  primeiro %c e o segundo %c pelas varizveis homem e mulher
	//homem e mulher sao variaveis do tipo caractere por isso o %c
	
}
