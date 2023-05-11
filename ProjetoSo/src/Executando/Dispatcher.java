package Executando;

import java.util.ArrayList;

public class Dispatcher {
	public static int retornaPosicao(Escalonador escalonador, ArrayList<Processo> lista) {
		int pos, numBilhete, qtddBilhete;
		qtddBilhete=escalonador.qtddBilhetes(lista);
		numBilhete=escalonador.Escolha(qtddBilhete);
		pos=Escalonador.encontrarBilhete(numBilhete, lista);
		return pos;
	}
}