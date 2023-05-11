package Lamp;

public class UsaLampada2 {
	
	
	public static void main(String[] args) {
		
		Lampada2 l1 = new Lampada2();
		Lampada2 l2 = l1;
		Lampada2 l3 = new Lampada2();
		Lampada2 l4 = l2;
		
		
		l2.ligar();
		l3 = null;
		l1 = l3;
	}

}
