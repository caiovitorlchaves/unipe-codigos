package Seguradoraa;

import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Esta classe ir� conter as funcoes que far�o o c�digo funcionar,
 * que ser�o chamadas no main.
 * @author CAIO VITOR CHAVES
 *
 */

public class Perguntas {
	
	
	/**
	 * Essa fun��o escrever� o resultado do c�lculo do valor do seguro
	 * em um arquivo.
	 * @param texto
	 */
	public static void escrever(String texto) {
		BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("arquivo.txt", true));
            bw.write(texto);
            bw.newLine();
            bw.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally { 
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ioe2) {
                    // just ignore it
                }
            }
        }
	}
	
	/**
	 * Esta fun��o ir� ler o arquivo para mostrar valores ja salvos.
	 */
	public static void ler() {
		try {
			FileReader arq = new FileReader("arquivo.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		 
		    String linha = lerArq.readLine(); // l� a primeira linha
		    while (linha != null) {
		    	System.out.printf("%s\n", linha);
		 
		        linha = lerArq.readLine(); // l� da segunda at� a �ltima linha
		      }
		 
		    	arq.close();
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.\n",
		          e.getMessage());
		    }
		 
		    System.out.println();
		  }
	
	
	/**
	 * Esta fun��o ser� chamada no fim do calculo para confirmar se quer salvar 
	 * no arquivo ou n�o.
	 * @param valorimovel
	 */
	public static void fim(float valorimovel) {
		System.out.println("O valor do seguro �:"+valorimovel);
		Scanner leitor = new Scanner(System.in);
		System.out.println("Gostaria de salvar os dados do seguro?\n1-Sim ou 2-Nao");
		int n=0;
		int resposta=0;
		while(n==0) {
			try {
				resposta=Integer.parseInt(leitor.nextLine());
				if(resposta==1||resposta==2) {
					n++;
				}
			}catch(NumberFormatException e) {
				System.out.println("Insira um valor v�lido.");
			}
		}
		if(resposta==1) {
			String texto = String.valueOf(valorimovel);
			System.out.println("Um nome para a empresa ou individuo");
			String nome = leitor.nextLine();
			Perguntas.escrever("Nome da empresa/individuo: "+ nome +" - Valor do seguro:"+ texto);
		}	
	}
	
	/**
	 * Esta fun��o perguntar� o valor do imovel e chamar� o calculo do valor
	 * do seguro.
	 */
	
	public static void faztudo() {
		Scanner leitor = new Scanner(System.in);
		//Contrato novo = new Contrato();
		float valorimovel = 0;
		int n=0;
		int resposta=0;
		while(resposta>=3 || resposta<=0) {
			System.out.println("1 para residencial ou 2 para empresarial:");
			try {
				resposta=Integer.parseInt(leitor.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Insira um valor valido.");
			}
		}
		
		
		System.out.println("Insira um valor para o imovel.");
		while(n==0) {
			try {
				valorimovel=Float.parseFloat(leitor.nextLine());
				n++;
				if(valorimovel<0) {
					n--;
					System.out.println("um valor positivo.");
				}
			}catch(NumberFormatException e){
				System.out.println("Um valor v�lido para o imovel.");
			}
		}
		if(resposta==1) {
			valorimovel = ContratoResidencial.obterValor(valorimovel);
			
		}
		
		else {
			ContratoEmpresarial novo = new ContratoEmpresarial();
			valorimovel = ContratoEmpresarial.obterValor(novo.tipoZona , novo.funcionarios,
					valorimovel, novo.visitas);
			
		}
		
	}	
}
