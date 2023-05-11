package exercicio;

import java.util.Scanner;

public class Questo2 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		
		while(contador<10) {
			System.out.println("Digite um numero: ");
			numero = leitor.nextInt();
			contador++;
			if(numero%2==0) {
				System.out.println("É par");
			
			}
			else {
				System.out.println("É impar");
			}
		}
	
		
		
	}

}
