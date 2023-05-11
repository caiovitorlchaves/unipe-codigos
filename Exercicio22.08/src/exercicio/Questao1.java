package exercicio;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
	
	float salario;
	float aumento;
	float salarioFinal;
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o seu salario: ");
    salario = leitor.nextFloat();
    
    System.out.println("Digite o aumento em %:");
    aumento = leitor.nextFloat();
    
    aumento = (aumento / 100) * salario;
    
    salarioFinal = aumento + salario;
    System.out.println("O Salario final é :" + salarioFinal);
   
	}
}
