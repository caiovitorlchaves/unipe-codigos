package Threads;

public class Conta {
	public int saldo;
	public void sacar() {
		saldo=saldo-1000;
	}
	public void depositar() {
		saldo=saldo+1000;
	}
}
