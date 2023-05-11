package Aula;

public class SwitchCase {
	public static void main(String[] args) {
		int x = 1;
		
		switch (x) {
		case 1:
			System.out.println("deu um");
			break;
		case 2:
			System.out.println("deu 2");
			
		case 3:
			System.out.println("Continuando...");
			break;
			
		default:
			System.out.println("Não foi ninguém");
		}
	}
}
