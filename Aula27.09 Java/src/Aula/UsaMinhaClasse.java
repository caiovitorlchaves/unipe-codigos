package Aula;

public class UsaMinhaClasse {
	
	public static void main(String[] args) {
		
		MinhaClasse m1 = new MinhaClasse();
		MinhaClasse m2 = new MinhaClasse();
		MinhaClasse m3 = new MinhaClasse();
		
		System.out.println(m3.getMeuNumero());
		System.out.println(m2.getQtdeObjetos());
		System.out.println(m3.getQtdeObjetos());
		System.out.println(m1.getQtdeObjetos());
		System.out.println(m1.getMeuNumero());
		System.out.println();
	}

}
