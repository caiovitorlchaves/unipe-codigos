package Aula;

public class UsaConta {
	
	public static void main(String[] args) {
		Conta bc = new Conta();
		bc.setNome("Caio");
		bc.setNumeroConta(123456);
		bc.setSaldo(0.0);
		
		bc.deposito(30800.0);
		bc.deposito(245.5);
		
		bc.extrato();
}
}
