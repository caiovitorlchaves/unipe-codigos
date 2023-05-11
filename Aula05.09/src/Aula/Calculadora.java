package Aula;

/**
 * Classe que realiza operaçoes matematicas.
 * @author CAIO VITOR CHAVES
 *
 */

public class Calculadora {
	
	/**
	 * Metodo que realiza a soma de dois valores.
	 * @param a contendo o valor inteiro a ser somado.
	 * @param b contendo o segundo valor a ser somado.
	 */
		public void somar(int a , int b) {
			System.out.println(a+b);
		}
	
		/**
		 * 
		 * * Metodo que realiza a subtração de dois valores.
		 * @param a inteiro com o valor principal
		 * @param b com o valor que será subtraido do valor principal.
		 * @return contendo a subtração dos valores a - b;
		 */
		public int subtrair(int a , int b) {
			return a - b;
		}
		
}
