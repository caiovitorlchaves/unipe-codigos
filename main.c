#include <stdio.h>
#include <stdlib.h>
#include<locale.h>

int main(int argc, char *argv[]) 
{
	setlocale(LC_ALL,"Portuguese");
	system("color E4");
	printf("Olá mundo\n");
	system("pause");
	system("cls");
	system("color A4");
	printf("\nHELLO  \nHELLO \n");
	system("pause");	
	return 0;
}
