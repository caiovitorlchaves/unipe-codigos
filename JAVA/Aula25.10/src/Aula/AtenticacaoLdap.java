package Aula; //CLASSE ABSTRATA � AQUELA QUE PRECISA SER PREENCHIDA.

public class AtenticacaoLdap extends Autenticacao {

	@Override
	public boolean login() {
		System.out.println("Realizando atentic��o no ");
		setUsuarioLogado("Caio Vitor");
		return true;
	}

	
}
