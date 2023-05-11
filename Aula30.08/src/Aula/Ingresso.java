package Aula;

/**
 * Classe que representa o ingresso
 * @author CAIO VITOR CHAVES
 *
 */
public class Ingresso {
	
	private int numero;
	private Cadeira cadeira;
	private Usuario usuario;
	private String espetaculo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cadeira getCadeira() {
		return cadeira;
	}
	public void setCadeira(Cadeira cadeira) {
		this.cadeira = cadeira;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getEspetaculo() {
		return espetaculo;
	}
	public void setEspetaculo(String espetaculo) {
		this.espetaculo = espetaculo;
	}

}
