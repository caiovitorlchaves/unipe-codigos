package Projeto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class ListaCliente {
	
	public void lista() throws IOException {
		
		try{
		ArrayList<String> lista = new ArrayList<String>();
		FileReader fr = new FileReader("Cliente.txt");
		BufferedReader br = new BufferedReader(fr);
		String linha = null;
		
		
		
		
		
		
		while ((linha = br.readLine())!= null){
			
			String[] s = linha.split(";");
			lista.add(s[0]);
			
		}
		
		String lists = "";
		for(String list : lista){
			lists += list+"\n";
		}
		
		JOptionPane.showMessageDialog(null, "Clientes: \n\n" + lists);
		br.close();
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Lista Vázia!");
		}
		
		
		
	}
		
}


