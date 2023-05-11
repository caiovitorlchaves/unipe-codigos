package Projeto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaSinistro {
	
	
	public void lista() throws IOException {
		
		try{
		FileReader fr = new FileReader("Sinistro.txt");
		ArrayList<String> lista = new ArrayList<String>();
		BufferedReader br = new BufferedReader(fr);
		
		String linha = null;
		
		while ((linha = br.readLine())!= null){
			
			String[] s = linha.split(";");
			for(int i = 0; i <= 2; i++){
				
				lista.add(s[i]);
			}
			lista.add("");
		}
		
		String lists = "";
		for(String list : lista){
			
			lists += list+"\n";
		}
		
		JOptionPane.showMessageDialog(null, "Sinistros: \n\n" + lists);
		br.close();
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Lista Vázia!");
		}
		
	}
	

}

