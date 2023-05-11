
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define	MAX 10

typedef struct elementos {
    char nome[50];
    
} t_elemento;


typedef struct lista {
    t_elemento vetor[MAX];
    int n; 
} t_lista; 


t_lista criar() {
    t_lista lista;

    lista.n = -1;

    return lista;
}

 
int isCheia(t_lista * lista) {
    return (lista->n == MAX-1);
}

 
int inserir (t_lista * lista, int pos, t_elemento dado) {
    if ( isCheia(lista) || (pos > lista->n + 1) || (pos < 0) )
        return 0;

    lista->vetor[pos] = dado;
    (lista->n)++;
    return 1;
}


int compara(t_elemento dado1, t_elemento dado2) {
    return strcmp(dado1.nome, dado2.nome);
}

int getPosicao(t_lista * lista, t_elemento dado) {
    int i;
    for (i=0; i<=lista->n; i++)
        if (compara(lista->vetor[i], dado)==0)
            return i;

    return -1;
}

int deslocaEsquerda(t_lista * lista, int pos) {
    int i;

    for (i=pos; i<(lista->n); i++)
        lista->vetor[i] = lista->vetor[i+1];

    return 1;
}

int remover (t_lista *lista, int pos) {
    if ( (pos > lista->n) || (pos < 0) )
        return 0;

    deslocaEsquerda(lista, pos);

    (lista->n)--;
    return 1;
}

int main() {
	t_lista m_lista;
	t_elemento m_elem;
	
	int i;
	char str[50];
	
	m_lista = criar();
	

	for (i = 0; i < 3; i++) {
		printf("Digite um nome:\n");
		scanf("%s", str);
		printf("Nome Digitado foi: [%s]\n", str);
		strcpy(m_elem.nome, str);
	
		inserir(&m_lista, i, m_elem);
	}
	

	for (i = 0; i < 3; i++) {
		printf("[%s]\n", m_lista.vetor[i].nome);
	}
	

	
	printf("Digite um nome para ser procurado:\n");
	scanf("%s", str);
	printf("Nome digitado para busca foi: [%s]\n", str);
	strcpy(m_elem.nome, str);
	i = getPosicao(&m_lista, m_elem);
	if (i != -1)
		printf("Nome encontrado na posicao: [%d]\n", i);
	else
		printf("O nome nao existe na lista\n");
		
	printf("Digite um nome para ser apagado:\n");
	scanf("%s", str);
	printf("O nome digitado apagado foi: [%s]\n", str);
	strcpy(m_elem.nome, str);
	i = getPosicao(&m_lista, m_elem);
	if (i != -1)
		remover(&m_lista, i);
	else
		printf("O nome nao existe na lista\n");

	
	for (i = 0; i <= m_lista.n; i++) {
		printf("[%s]\n", m_lista.vetor[i].nome);
	}
	



}
