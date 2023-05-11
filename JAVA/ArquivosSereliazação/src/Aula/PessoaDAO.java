package Aula;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PessoaDAO {
	
	
	public void salvar(Pessoa pessoa) {
	
		String cpf = pessoa.getCpf();
	try {
		FileOutputStream fos = new FileOutputStream(cpf);
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oss.writeObject(pessoa);
		oss.close();
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
	
	public Pessoa consultar(String cpf) {
		
		
	try {
		FileInputStream fis = new FileInputStream(cpf);
		ObjectInputStream ois = new ObjectInputStreamt(fis);
		Pessoa pessoa = (Pessoa) ois.readObject();
		ois.close();
		fis.close();
		return pessoa;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	
	
	
	
}
