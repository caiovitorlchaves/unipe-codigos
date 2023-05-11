#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) 
{
	float nota1,nota2,media;
	printf("Digite a nota1: ");
	scanf("%f",&nota1);
		printf("Digite a nota2: ");
	scanf("%f",&nota2);
	media = (nota1+nota2)/2;
	printf("Media: %.1f\n",media);
	if (media<7)
	{
		printf("\nAluno Reprovado\n");
	}
	else 
	{
		printf("Aluno Aprovado");
	}
		
	system("pause");	
	return 0;
}
