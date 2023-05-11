package Projeto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;;

public class ListaContratos {
	
	public void lista() throws IOException{
		
		try{
		ArrayList<String> lista = new ArrayList<String>();
		FileReader fr = new FileReader("Cliente.txt");
		BufferedReader br = new BufferedReader(fr);
		String linha = null;
		
		
		
		
		
		
		while ((linha = br.readLine())!= null){
			
			String[] s = linha.split(";");
			
			
			for(int i = 0; i <= 5; i++){
				
				lista.add(s[i]);
			}
			lista.add("");
			
		}
		
		
		
		
		String lists = "";
		for(String list : lista){
			
			lists += list+"\n";
		}
		
		JOptionPane.showMessageDialog(null, "Contratos: \n\n" + lists);
		br.close();
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Lista Vázia!");
		}
		
		
		
	}
	

}
