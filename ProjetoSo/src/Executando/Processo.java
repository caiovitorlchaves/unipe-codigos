package Executando;

public class Processo {
	private int id;
	private int tempoExec;
	private int bilhetes;
	
public Processo() {
	
}
	
public Processo(int id,int tempoexec) {
	this.id = id;
	this.tempoExec = tempoexec;
	this.bilhetes=1;
	
}

public int getId() {
		return id;
	}

public void setId(int id) {
		this.id = id;
}

public int getTempoExec() {
		return tempoExec;
}

public void setTempoExec(int tempoExec) {
		this.tempoExec = tempoExec;
}
public int getBilhetes() {
	return bilhetes;
}
public void setBilhetes(int bilhetes) {
	this.bilhetes=bilhetes;
}

public String getDados() {
	return "Id:" + this.id + ", Tempo:" + this.tempoExec; 
}


public int definirId(int tamanho) {
	return this.id=tamanho;
};

}