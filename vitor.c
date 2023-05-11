#include <stdio.h>
#include <stdlib.h>
#include<locale.h>

int main(int argc, char *argv[]) 
{
	char nome[30];
	printf("Digite o seu nome: ");
	gets(nome);
	system("cls");
	printf("Bem Vindo %s\n",nome);
	system("pause");	
	return 0;
}
