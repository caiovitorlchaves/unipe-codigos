package Qualquernome;

import java.util.Scanner;

/**
 * Classe que extende a classe contrato.
 * @author Cayo
 */
public class ContratoResidencial extends Contrato{
	static Scanner leitor = new Scanner(System.in);
	
	/**
	 * Função que faz o calculo do valor do seguro caso contrato seja eresidencial.
	 * @param valorimovel
	 * @return
	 */
	static float obterValor(float valorimovel) {
		int zona =0;
		while(zona>=3 || zona<=0) {
			try {
				System.out.println("1 para urbana ou 2 para suburbana");
				zona=Integer.parseInt(leitor.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Um valor válido para zona");
			}
		}
		if(zona==1) {
			//urbana
			valorimovel=(valorimovel*2)/100 + valorimovel/100;
		}
		else {
			//suburbana
			valorimovel=(float) ((valorimovel*2)/100 + (valorimovel*(0.5))/100);
		}
		Perguntas.fim(valorimovel);
		return valorimovel;
	}
}