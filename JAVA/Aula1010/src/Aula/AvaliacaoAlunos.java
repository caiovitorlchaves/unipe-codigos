package Aula;

public class AvaliacaoAlunos {
	
	private String nome;
	private String ra;
	private int nota;
	
	public void imprimeNota( ) {
		try {
			System.out.println("Nome: " + nome.toUpperCase());
			System.out.println("RA: " + ra);
			System.out.println("Nota: " + this.nota);
	
		}catch (NullPointerException e) {
			System.out.println("Erro 0001");
		}catch (Exception e ) { //se isso aqui tiver primeiro vai da erro de compilação
			System.out.println("Erro 500 : erro alguma coisa");
			System.out.println("Fim");
		}
		// TRY CATCH/TRY FINALY/TRY CATCH FINALY
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
