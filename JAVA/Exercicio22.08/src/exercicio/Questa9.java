package exercicio;

import java.util.Scanner;

public class Questa9 {

	public static void main(String[] args) {
		String nome;
		String sexo;
		String nomeMulherMaisBaixa = "";
		String nomePacienteMaisVelho = "";
		
		double peso;
		double altura;
		double alturaMaisBaixa = 10;
		
		int idade;
		int qtdeTotal = 0;
		int qtdeMasc = 0;
		int somaIdadeMasc = 0;
		int qtIdade18 = 0;
		int qtdeFem = 0;
		int qtdeFemAlturaPeso = 0;
		int idadeMaisVelha = 0;
		
		while(true) {
			System.out.println("Entre com o nome,sexo,peso,idade,altura");
			nome = new Scanner(System.in).next();
			if(nome.equals("Fim"))
				break;
			qtdeTotal++;
			sexo = new Scanner(System.in).next();
			peso = new Scanner(System.in).nextDouble();
			idade = new Scanner(System.in).nextInt();
			altura = new Scanner(System.in).nextDouble();
			if(sexo.equals("masculino")) {
				qtdeMasc++;
				somaIdadeMasc = somaIdadeMasc + idade;
			}
			if(sexo.equals("feminino")) {
				qtdeFem++;
				if(altura >= 1.6 && altura <= 1.7 &&  peso > 70) {
					qtdeFemAlturaPeso++;
				}
				if(altura < alturaMaisBaixa) {
					alturaMaisBaixa = altura;
					nomeMulherMaisBaixa = nome;
				}
			}
			if(idade >= 18 && idade <= 25) {
				qtIdade18++;
				
			}
			if(idade > idadeMaisVelha) {
				idadeMaisVelha = idade;
				nomePacienteMaisVelho = nome;
				
			}
		}
		System.out.println("Quantidade de Pacientes: " + qtdeTotal);
		System.out.println("Média de idade dos homens: "+ (double)somaIdadeMasc/qtdeMasc);
		System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "+qtdeFemAlturaPeso);
		System.out.println("Nome de mulher mais baixa: " + nomeMulherMaisBaixa);
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + qtIdade18);
		System.out.println("Nome do Paciente Mais Velho: " + nomePacienteMaisVelho);
	}
}
