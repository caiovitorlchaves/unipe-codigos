package Aula;

import java.util.Scanner;

/**
 * 
 * @author CAIO VITOR CHAVES
 *
 */
public class Teatro {
	private Scanner leitor = new Scanner(System.in);
	private Cadeira[] cadeirasFileiraUm;
	private Cadeira[] cadeirasFileiraDois;
	private Cadeira[] listaUsuarios;
	private boolean configurado = false;
	
	public void setup() {
		if(!configurado) {
		System.out.println("Informe quantidade de " + "cadeiras para filera 1");
		
		int quantidade = Interger.parseInt(leitor.nextLine()); cadeirasFileiraUm = new Cadeira[quantidade];
		
		System.out.println("Informe quantidade de " + "cadeiras para filera 2");
		
		int quantidade = Interger.parseInt(leitor.nextLine()); cadeirasFileiraDois = new Cadeira[quantidade];
		
		System.out.println("Informe quantidade de " + "usuarios");
		
		int quantidade = Interger.parseInt(leitor.nextLine()); listaUsuarios = new Usuario[quantidade];
		
		configurado = true;
		
	}else {
		System.out.println("Setup já configurado");
	}
}
	public void cadatraUsuario() {
		int posicao = obterPosicaoLivre();
		
		if(posicao>0)
		listaUsuarios[posicao] = usuario;
		System.out.println("Usuário cadastrado");
		System.out.println("Id = " + posicao);
		
	}else {
		System.out.println("Lista de usuários cheia");
	}
	
	public int obterPosicaLivre() {
		for(int cont=0; cont<listaUsuarios.length; cont++) {
			if(listaUsuarios[cont]==null)
				return cont;
		}
		return - 1;
	}
	
	public boolean comprarIngresso() {
		System.out.println("Informe o CPF do usuário");
		String cpf = leitor.nextLine();
		Usuario u  = buscarUsuario(cpf);
		if(u!=null) {
			System.out.println("Informe o número da cadeira");
			int cadeiraPos = Interger.parseInt(leitor.nextLine());
			System.out.println("Informe o número da fileira");
			int fileira = Interger.parseInt(leitor.nextLine());
			
			if(fileira==1) {
				if(cadeirasFileiraUm[cadeiraPos] == null) {
					Cadeira cadeira = new Cadeira();
					cadeira.setFileira(fileira);
					cadeira.setNumero(cadeiraPos);
					Ingresso ingresso = new Ingresso();
					ingresso.setCadeira(cadeira);
					ingresso.setNumero(cadeiraPos);
					ingresso.Usuario(u);
					cadeirasFileiraUm[cadeiraPos]= cadeira;
				}
			}
		}
		
		return false;
	}
	
	public Usuario buscarUsuario(String cpf) {
		Usuario retorno = null;
		for(int cont = 0; cont<listaUsuarios.length; cont++) {
			retorno = listaUsuarios[cont];
			if(retorno!= null) {
				if(retorno.getCpf().equalsIgnoreCase(cpf)) {
					return retorno;
					
				}
			}
		}
		return retorno;
	}
}