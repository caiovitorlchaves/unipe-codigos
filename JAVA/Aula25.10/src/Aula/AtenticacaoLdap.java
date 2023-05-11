package Aula; //CLASSE ABSTRATA É AQUELA QUE PRECISA SER PREENCHIDA.

public class AtenticacaoLdap extends Autenticacao {

	@Override
	public boolean login() {
		System.out.println("Realizando atenticção no ");
		setUsuarioLogado("Caio Vitor");
		return true;
	}

	
}
