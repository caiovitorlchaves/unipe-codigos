package Qualquernome;
import java.util.Scanner;

/**
 * Classe onde se localiza o main.
 * @author Cayo
 *
 */
public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int menu=1;
		/**
		 * loop para acessar as opcões: calcular ou ler.
		 * podemos chamar isso de menu.
		 */
		while(menu>=3 || menu>=0) {
			try {
				System.out.println("1-Calcular valor do seguro\n2-ver seguros registrados\n3-Sair");
				menu=Integer.parseInt(leitor.nextLine());
				if(menu==1) {
					Perguntas.faztudo();
				}
				else if(menu==2) {
					Perguntas.ler();
				}
				else if(menu==3){
					break;
				}
				else {
					System.out.println("Para sair digite 3, qualquer outo numero apenas reiniciara"
							+ " o programa");
				}
			}catch(NumberFormatException e) {
				System.out.println("Um inteiro por favor.");
			}
		}
	}
}