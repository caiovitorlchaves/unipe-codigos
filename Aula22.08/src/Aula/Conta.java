package Aula;

public class Conta {
	
	private String nome; //PARA GERAR OS "GETS E "SETS" AS VARIAVEIS PRECISAM ESTA PRIVATE.//
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}


	private Double saldo;
	private long numeroConta;
	
	public void deposito(double valorDeposito) {
	this.saldo += valorDeposito;
	System.out.println("Valor Deposito: " + valorDeposito);
	}
	public void saque(double valorSacado) {
		this.saldo -= valorSacado;
		System.out.println("Valor Sacado: " + valorSacado);
		}
	
	public double obterSaldo(long numeroConta) {
		if(this.numeroConta==numeroConta) {
		return this.saldo; //metodo com retorno
		}
		
		return 0.0;
	}


public void extrato() {
	System.out.println("Nome: " + nome);
	System.out.println("Numero Conta : " + numeroConta);
	System.out.println("Saldo: " + saldo);
}


}

