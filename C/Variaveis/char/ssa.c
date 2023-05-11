#include <stdio.h>
#include <stdlib.h>
#include<locale.h>

int main(int argc, char *argv[]) 
{
	char nome[30];
	system("color 71");
	printf("Digite o seu nome: ");
	gets(nome);
	system("cls");
	system("color 1F");
	printf("Bem Vindo ao M.A.B %s\7\a \n",nome);
	system("pause");	
	return 0;
}
