package Aula;

import java.util.Scanner;

public class GravaPessoa {

	
	
	
	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("Informe o nome:");
		pessoa.setNome(leitor.nextLine());
		
		System.out.println("Informe o Cpf:");
		pessoa.setCpf(leitor.nectLine());
		
		
		System.out.println("Informe a idade:");
		pessoa.setIdade(leitor.nextInt());
		
		PessoaDAO dao = new PessoaDAO();
		dao.salvar(pessoa);
		
		System.out.println("Programa encerrado.");
	}
}
