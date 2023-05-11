package exercicio;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		double gasolina,conta;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quanto litros de gasolina voce abasteceu?");
		gasolina=leitor.nextFloat();
		gasolina=gasolina*2.5;
		conta=gasolina+6;
		System.out.println("O valor da conta final é: R$"+ conta);
	}

}