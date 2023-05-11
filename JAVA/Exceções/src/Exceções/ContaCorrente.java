package Exceções;
	
	public class ContaCorrente {
		
		private float valor = 100.0f;
		
		public void sacar(float valorSaque) throws SaldoInsuficienteException {
			
			if(this.valor>valorSaque) {
				this.valor -= valorSaque;
			}
			else {
				//throw new RunTimeException();
				throw new SaldoInsuficienteException();
			}
		
		}


}
