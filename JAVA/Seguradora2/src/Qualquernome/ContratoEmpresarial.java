package Qualquernome;

import java.util.Scanner;

/**
 * Classe que extende a classe contrato.
 * @author Cayo
 */
public class ContratoEmpresarial extends Contrato{
	int tipoZona;
	int funcionarios;
	int visitas;
	static Scanner leitor = new Scanner(System.in);
	
	/**
	 * Função que calcula o valor do seguro, caso o contrato seja empresarial.
	 * @param zona nesse caso definirá o tipo de empresa, se é comercio ou industria.
	 * @param funcionarios define quantidade de funcionarios da empresa.
	 * @param valorimovel define o valor do imovel.
	 * @param visitas quantidade de visitas na empresa.
	 * @return
	 */
	static float obterValor(int zona, int funcionarios, float valorimovel,int visitas) {
		funcionarios=0;
		visitas=0;
		while(funcionarios<=0) {
			try {
				System.out.println("Quantidade de funcionarios:");
				funcionarios=Integer.parseInt(leitor.nextLine());
				System.out.println("Visitas diarias:");
				visitas=Integer.parseInt(leitor.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Insira um valor valido.");
			}
		}
		zona=0;
		while(zona<=0 || zona>=3) {
			System.out.println("1 para industria ou 2 pro comercio");
			try {
				zona=Integer.parseInt(leitor.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Insira um valor válido");
			}
		}
		valorimovel=(float) (valorimovel*4/100 + (funcionarios/10)*(0.2)*valorimovel/100 + 
				(visitas/200)*(0.3)*valorimovel/100);
		if(zona==1) {
			//industria
			valorimovel=valorimovel + valorimovel/100;
		}
		else {
			//comercio
			valorimovel=(float) (valorimovel + valorimovel*(0.5)/100);
		}
		Perguntas.fim(valorimovel);
		return valorimovel;
	}
}