package Revisao;

public abstract class Conta {

	String numero;
	float saldo;

	public void exibirMensagem() {
		System.out.println("Bem vindo à Conta, seu saldo é: " + this.saldo);
	}

	public abstract void creditar(float valor);

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

}
