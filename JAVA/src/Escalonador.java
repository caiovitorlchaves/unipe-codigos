import java.util.ArrayList;
import java.util.Random;


public class Escalonador {
	private int qtddProcessos;

	public int getQtddProcessos() {
		return qtddProcessos;
	}

	public void setQtddProcessos(int qtddProcessos) {
		this.qtddProcessos = qtddProcessos;
	}
	
	//retorna a quantidade de bilhetes de um array, que será usado para calcular a probabilidade
	public static int qtddBilhetes(ArrayList<Processo> lista) {
		int qtdd=0;
		for(int i=0;i<lista.size();i++) {
			qtdd=qtdd+lista.get(i).getBilhetes();
		}
		return qtdd;
	}
	
	//aqui é feita a escolha de um numero aleatorio
	public static int Escolha(int bilhetes) {
		int x;
		Random gerador = new Random();
		x=gerador.nextInt(bilhetes);
		return x;
	}
	
	
	//aqui utilizamos o numero gerado para definir qual processo foi selecionado.
	public static int encontrarBilhete(int numBilhete, ArrayList<Processo> lista) {
		int pos=0,i;
		for(i =0;i<lista.size();i++) {
			if(pos>=numBilhete) {
				return i;				
			}
			pos=pos+lista.get(i).getBilhetes();
		}
		return i;
	}
}
