package Exceções;
	
	public class NovaExcecao {
		private float preco = 58.0f;
		
		public void mostrar(float valor) throws SaldoInsuficienteException {
			
			if(this.preco>valor) {
				this.preco += valor;
			}
			else {
				throw new SaldoInsuficienteException();
				
			}
		}
		
	}

