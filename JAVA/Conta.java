package Revisao;

public class Conta {

	String numero;
	float saldo;

	public void exibirMensagem() {
		System.out.println("Bem vindo à Conta, seu saldo é: " + this.saldo);
	}

	public void creditar(float valor) {
		if(valor < 0.0) {
			System.out.println("Valor Invalido");
			return;
		}
		
		this.saldo += valor;
		System.out.println("Valor Creditado, seu novo saldo é: " + this.saldo);
	}

	public float debitar(float valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo Insuficiente");
			return this.saldo;
		}
		float valorDebitado = this.saldo - valor;
		this.saldo = valorDebitado;
		System.out.println("Valor Debitado, seu novo saldo é: " + this.saldo);
		return valorDebitado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public static void main(String[] args) {
		Conta brasil = new Conta();

		brasil.exibirMensagem();
		brasil.creditar(90000); //Valida se o valor não é negativo
		brasil.debitar(100000);//Valida se o valor não é maior que o Saldo
	}

}
