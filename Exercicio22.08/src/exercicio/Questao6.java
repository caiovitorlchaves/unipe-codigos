package exercicio;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		float salario,prestacao;
		Scanner leitor = new Scanner(System.in);
		System.out.println("O valor do salario bruto:");
		salario = leitor.nextFloat();
		System.out.println("O valor da presta�ao:");
		prestacao = leitor.nextFloat();
		if(salario/100*30>=prestacao) {
			System.out.println("O empr�stimo pode ser concedido.");
		}
		else {
			System.out.println("O empr�stimo n�o pode ser concedido.");
		}
	}

}