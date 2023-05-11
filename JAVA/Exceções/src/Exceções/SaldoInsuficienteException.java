package Exceções;

	public class SaldoInsuficienteException extends Exception {
		public SaldoInsuficienteException() {
			super("Sem saldo na conta");
		}
	}



