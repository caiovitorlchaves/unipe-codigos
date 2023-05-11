package Aula;

public class MinhaClasse {
	private static int qtdeObjetos = 0;
	private int meuNumero;
	public MinhaClasse ( ) {
		qtdeObjetos++;
			meuNumero = qtdeObjetos;
			
	}
	
	public static int getQtdeobjetos() {
		return qtdeObjetos;
		
	}
	public static int getQtdeObjetos() {
		return qtdeObjetos;
	}
	public static void setQtdeObjetos(int qtdeObjetos) {
		MinhaClasse.qtdeObjetos = qtdeObjetos;
	}
	public int getMeuNumero() {
		return meuNumero;
	}
	public void setMeuNumero(int meuNumero) {
		this.meuNumero = meuNumero;
	}
}
