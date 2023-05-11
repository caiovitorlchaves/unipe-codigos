package Aula;

public class ThrowsException {  //TEMOS DE DOIS TIPOS DE EXCEPTION OS "NAO CHECADOS" E OS "CHECADOS"
	//OS NAO CHECADOS NORMALMENTE ACONTECEM, 
	
	private String nome;
	private String ra;
	private int nota;
	
	public void imprimeNota( ) throws Exception //pode lançar uma Exception  //Erro de compilação//
	{
		
			System.out.println("Nome: " + nome.toUpperCase());
			System.out.println("RA: " + ra);
			System.out.println("Nota: " + this.nota);
		
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



