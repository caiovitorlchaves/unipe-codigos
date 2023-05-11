package Lamp;

public class Lampada2 {
	private boolean estaLigada = false;
	
	public boolean getEstaLigada() {
		return this.estaLigada;
	}
	
	public void ligar() {
		if (!getEstaLigada()) {
			this.estaLigada = true;
		} else {
			System.out.println("A Lampada ja esta ligada");
		}
	}
	public void desligar() {
		if (!getEstaLigada()) {
			this.estaLigada = false;
		} else {
			System.out.println("A Lampada ja esta desligada");
	

}
}
}