package Aula;

/**
 * Classe que realiza opera�oes matematicas.
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
		 * * Metodo que realiza a subtra��o de dois valores.
		 * @param a inteiro com o valor principal
		 * @param b com o valor que ser� subtraido do valor principal.
		 * @return contendo a subtra��o dos valores a - b;
		 */
		public int subtrair(int a , int b) {
			return a - b;
		}
		
}
