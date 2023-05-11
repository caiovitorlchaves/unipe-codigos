package Aula;

public class EstruturaDeCon {
	public static void main(String[] args) {
		
		int valor = 2;
		
		if(valor != 2)
			System.out.println("Valor diferente de 2");
			System.out.println(valor);
			System.out.println("Java");
			
			int[] lista = new int[10];
			int[] listaNumeros = {1,2,3,4,5,6,10};
			
			for(int cont=0; cont<7; cont++) {
				System.out.println(listaNumeros[cont]);
			}
			
			for(int v: listaNumeros) {
				System.out.println(v);
			}
			
			valor = 0;
			while(valor<9) {
				
				if(valor==8)
					break;
				
				if(valor==6)
					continue;
				
				valor++;
			}
			
			System.out.println(valor);
		
	}

}
