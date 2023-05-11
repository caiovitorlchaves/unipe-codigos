package Executando;

import java.util.ArrayList;

public class Cpu {
	public Cpu(){
	}
	
	public void exibir(ArrayList<Processo> lista) {
		for(int i=0;i<lista.size();i++) {
			System.out.println("Id: "+ lista.get(i).getId() + " ; Tempo restante: "+ lista.get(i).getTempoExec());
			System.out.println("Quantidade de bilhetes: "+ lista.get(i).getBilhetes());
			System.out.println("  ");
		}
	}
	
	
	public void executaProcesso(Processo processo) {
		System.out.println("Processo executando - id:" + processo.getId() + " ; Tempo restante:" + processo.getTempoExec());
	}
	public void qtddProcessos(ArrayList<Processo> lista) {
		int qtdd=0;
		for(int i=0;i<lista.size();i++) {
			qtdd++;
		}
		System.out.println("Quantidade de processos na lista de pronto: "+ qtdd);
	}
}