package Threads;

public class Threads implements Runnable {
	
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println("Ola");
			if(i<5) {
				System.out.println("Hola");
			}
			i++;
			
			try {
				Thread.sleep(2000);
				}catch (InterruptedException e ) {
				   e.printStackTrace();
				}
		}
	}

	public static void main(String[] args) {
		
		
			Threads thre = new Threads();
			Thread t = new Thread(thre);
			t.start();
	
}
}