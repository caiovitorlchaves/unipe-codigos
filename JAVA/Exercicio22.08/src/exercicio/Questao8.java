package exercicio;

import java.util.Scanner;

public class Questao8 {
public static void main(String[] args) {
		
		String nome;
		int dias;
		float valorCliente = 0.0f;
		float totalPousada = 0.0f;
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		
		while(true) {
			System.out.println("Informe o nome: ");
			nome = leitor.nextLine();
			System.out.println("Informe o numero de diarias: ");
			dias = Integer.parseInt(leitor.nextLine());
			//Integer tipo objeto do int
			valorCliente = dias * 40.0f;
			
			if(dias<10) {
			valorCliente += (dias*10);
			
		}
			
			System.out.println("Cliente: " + nome);
			System.out.println("Conta: " + valorCliente);
			
			System.out.println("Continuar 1 - Sim");
			System.out.println ("          2 - Não");
			opcao = Integer.parseInt(leitor.nextLine());
			
			totalPousada += valorCliente;
			
			if(opcao==2) {
				System.out.println("Total arrecadado; " + totalPousada);
				System.exit(0);
			}
		}
		

}

}
	

	
	
	
		
			
			
		

