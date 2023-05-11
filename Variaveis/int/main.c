#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) 
{
	int idade;
	system("color E9");
	printf("Digite a sua idade: ");
	scanf("%d", &idade);
	printf("Idade: %d", idade);
	// a linha abaixo executa uma estrutura de de decisão
	if (idade<18)
	{
		system("color A6");
		printf("\nmenor de idade\n");
	}
	if (idade>=18)
	{
		system("color D2");
		printf("\nmaior de idade\n");
		
	}
	system("pause");
	return 0;
}
