package Aula;

public class AutenticacaoFacebook extends Autenticacao {

	@Override
	public boolean login() {
		System.out.println("Auth facebook");
		setUsuarioLogado("CAIO");
		return true;
	}

}
