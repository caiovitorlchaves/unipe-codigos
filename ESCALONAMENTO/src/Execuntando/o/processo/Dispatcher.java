package Execuntando.o.processo;
import java.util.ArrayList;

public class Dispatcher {
	public Dispatcher() {
		
	}
	public static int entregaPosicao(ArrayList<Processo> lista) {
		int pos;
		pos=Escalonador.qtddBilhetes(lista);
		pos=Escalonador.Escolha(pos);
		pos=Escalonador.encontrarBilhete(pos, lista);
		return pos;
	}
}
