package Aula;

/**
 * 
 * @author CAIO VITOR CHAVES
 *
 */
public class Pessoa {
	
	
	
	public Pessoa(String nome, int idade) {
		Nome = nome;
		this.idade = idade;
	}
	private String Nome;
	private int idade;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade<0) {
			System.out.println("Valor não é permitido");
			idade = 0;
		}else 
		this.idade = idade;
	}

}
