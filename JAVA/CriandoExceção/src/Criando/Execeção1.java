package Criando;

public class Execeção1 {
	
	
	public void CriandoUmBug() {
		try {
			System.out.println("Bug 1");
			System.out.println("Bug 2);
			System.out.println(");
	
		}catch (NullPointerException e) {
			System.out.println("Erro 0001");
		}catch (Exception e ) {
			System.out.println("Erro 500 : erro alguma coisa");
			System.out.println("Fim");
		}
	}
}
