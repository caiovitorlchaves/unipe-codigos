import java.util.ArrayList;

import java.util.Scanner;

public class Cpu {
	public static void tempo() throws InterruptedException {
		Thread.sleep(4000);
	}
	
	public static void main(String[] args) throws InterruptedException  {
		
		//CRia a lista de programas prontos para a execução, e um objeto que será o processo executando.
		ArrayList<Processo> lista = new ArrayList<>();
		Scanner leitor = new Scanner(System.in);
		Processo Executando = new Processo();
		int i=0, parada=0, pos, j;
		
		//Preenche 10 posições com Processos
		for(i=0;i<10;i++) {
			lista.add(new Processo(i, i*1000));
		}
		
		//Ficará executando até que ordenemos a parada.
		while(true) {
			//Escolhe aleatoriamente um processo que será executado
			pos=Escalonador.qtddBilhetes(lista);
			pos=Escalonador.Escolha(pos);
			pos=Escalonador.encontrarBilhete(pos, lista);
			Executando = lista.get(pos);
			
			//Printa o Processo escalonado
			System.out.println("Processo executando, Id: "+ Executando.getId() + "; Tempo que ainda possui: "+ Executando.getTempoExec());
			System.out.println("Número de processo: "+ lista.size());
			tempo();
			
			//Adiciona um novo processo
			lista.add(new Processo(i, 4000));
			
			//Verifica se o processo Foi finalizado
			if(lista.get(pos).getTempoExec()<=4000) {
				lista.remove(pos);
			}
			else {
				int tempoexec=lista.get(pos).getTempoExec();
				lista.get(pos).setTempoExec(tempoexec-4000);
				lista.get(pos).setBilhetes(0);
			}
			
			//adiciona 1 bilhete a todos os processos que não foram escolhidos
			for(j=0;j<lista.size();j++) {
				lista.get(j).setBilhetes(lista.get(j).getBilhetes()+1);
			}
			
			System.out.println("     ");
			parada++;
			i++;
			if(i%5==0) {
				System.out.println("Quer parar?");
				System.out.println("Sim - 0 ; Não - 1");
				parada= leitor.nextInt();
				if(parada==0) {
					break;
				}
			}
			
			
		}
		
		//Printa todos os processos da lista de pronto
		for(j=0;j<lista.size();j++){
			System.out.println("Id:" + lista.get(j).getId()+"; Tempo que ainda possui de execução:"+ lista.get(j).getTempoExec());
			System.out.println("Quantidade de bilhetes:"+ lista.get(j).getBilhetes());
		}
		leitor.close();
		//System.out.println("Qtdd de bilhetes:"+ Escalonador.qtddBilhetes(lista));
	}
}
