	package Aula;

public class UsaCalculadora {
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		c.somar(2, 3);
		int valor = c.subtrair(1000, 5); // para que print o resultado do return na tela é necessario colocar "int valor = nome da variavel. ..."
		System.out.println(valor);
	}

}
