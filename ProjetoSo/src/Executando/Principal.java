package Executando;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void tempo(int tempoExec) throws InterruptedException {
		if(tempoExec<=4000) {
			Thread.sleep(tempoExec);
		}
		else {
			Thread.sleep(4000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Processo> lista = new ArrayList<>();
		int i, parada=1, pos;
		Scanner leitor = new Scanner(System.in);
		for(i=0;i<10;i++) {
			if(i==0) {
				lista.add(new Processo(i, 1000));
			}
			else{
				lista.add(new Processo(i, i * 1000));
			}
		}
		
		Cpu cpu = new Cpu();
		Escalonador escalonador = new Escalonador();
		Dispatcher dispatcher = new Dispatcher();
		while(parada!=0) {
			pos = Dispatcher.retornaPosicao(escalonador, lista);
			cpu.executaProcesso(lista.get(pos));
			tempo(lista.get(pos).getTempoExec());
			
			if(lista.get(pos).getTempoExec()<=4000) {
				lista.remove(pos);
			}
			else {
				lista.get(pos).setTempoExec(lista.get(pos).getTempoExec()-4000);
				lista.get(pos).setBilhetes(0);
			}
			
			
			if(i%7==0) {
				lista.add(new Processo(i, 4000));
			}else {
				lista.add(new Processo(i, i%7*1000));
			}
			
			for(int j=0;j<lista.size();j++) {
				lista.get(j).setBilhetes(lista.get(j).getBilhetes() + 1);
			}
			if(i%4==0) {
				System.out.println("0: Parar; 1: Exibir Lista; 2: Continuar");
				parada=leitor.nextInt();
				if(parada==1) {
					cpu.exibir(lista);
					tempo(8000);
				}
			}	
			i++;
		}
		leitor.close();
	}

}