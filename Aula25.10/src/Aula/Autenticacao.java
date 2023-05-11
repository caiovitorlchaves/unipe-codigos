package Aula;

/**
 * 
 * @author CAIO VITOR CHAVES
 *
 */
public abstract class Autenticacao {
	
	private String usuariologado;
	
	
	public abstract boolean login();
	
	
	public String getUsuarioLogado() {
		return this.usuariologado;
	}

	public void setUsuarioLogado(String usuario) {
		this.usuariologado = usuario;
	}
}
