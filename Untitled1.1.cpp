typedef struct nome{
	char vetor_nome[8];
}t_nome;

typedef struct nomes{
	t_nome vetor_nome[2];
	
}t_nomes;

typedef struct elementos{
	char nome[9];
}t_elementos;

typedef struct no {
    struct no * anterior;
	t_elemento dados;   
    struct no  * prox; 
} t_no; 

