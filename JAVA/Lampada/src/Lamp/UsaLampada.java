package Lamp;

public class UsaLampada {

	public static void main(String[] args) {
		
		Lampada l1,l2;
		l1 = new Lampada(); //Instanciamento do objeto
		l2 = new Lampada();
		
		l1.acender();
		l2.apagar();
		
		if (l1.getAcessa()) {
			System.out.println("Lampada l1 esta ligada");
		} else {
			System.out.println("Lamapada l2 esta desligada");
		}
	} 	
	
}
