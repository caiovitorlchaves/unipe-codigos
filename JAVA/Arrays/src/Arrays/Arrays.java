package Arrays;

public class Arrays {
	
public static void main(String[] args) {	
		
		
		int tamanho = 300; //variavel que ir� definir o tamanho do vetor
		int vetor[] = new int[tamanho];
		int posicao; //variavel que define o �ndice do vetor
		
		//percorendo as posicoes do vetor
		
		System.out.println("Formata��o 1");
		for (posicao = 0; posicao < tamanho; posicao++) {
			vetor[posicao] = 45; //transformando todos os elementos das posicoes do vetor em 45
			System.out.println(vetor[posicao]); //imprimindo todos os elementos contidos no vetor
			
		}
		
		System.out.println("\nFormata��o 2\n");
		for (posicao = 0; posicao < tamanho; posicao++) {
			vetor[posicao] = 45; 
			System.out.print(vetor[posicao]);
		}
		
		System.out.println("\n\nFormata��o 3");
		for (posicao = 0; posicao < tamanho; posicao++) {
			vetor[posicao] = 45; 
			System.out.println(vetor[posicao]);
			if( posicao %2 == 0 ) {
				System.out.println("\n");
			}
		}
		


}

}
