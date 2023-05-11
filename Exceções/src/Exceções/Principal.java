package Exceções;
	public class Principal {
		public static void main(String[] args) throws ErroChecado {
			
			ContaCorrente conta = new ContaCorrente();
			
			//conta.sacar(100.0f);
			
			ErroChecado erro = new ErroChecado("Erro");
			
			throw erro;
			
			//System.out.println("Alo");
		}
	}



