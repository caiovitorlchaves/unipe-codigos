package Lamp;

class Lampada {
	boolean estaAcessa = false;
	//Metodo que informa se esta acessa ou apagada.
	boolean getAcessa() {
		return estaAcessa;
	}
	//Metodo aceder
	void acender() {
		estaAcessa = true;
	}
	//Metodo Apagar
	void apagar() {
		estaAcessa = false;
	}

}
