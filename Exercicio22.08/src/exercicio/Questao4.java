package exercicio;

import java.util.Scanner;

public class Questao4 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float salario; 
		float aumento = (float) 0.2;
		float salarioReajustado;
		
		System.out.println("Digite o seu salario: ");
		salario = leitor.nextFloat();

	    salarioReajustado = salario*aumento;
		if(salario<500) {
			System.out.println("O salario Reajustado é: " + salarioReajustado);
			
		}
		
		else {
			System.out.println("Voce nao recebera o aumento");
		}
		
		
		
		
	
		

		
		
	}

}
