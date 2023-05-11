package Projeto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaContratoSemSinistro {
	
	public void lista() throws IOException{
		
		
		
	
			try{
			ArrayList<String> lista = new ArrayList<String>();
			FileReader fs = new FileReader("Cliente2.txt");
			BufferedReader br = new BufferedReader(fs);
			String linha = null;
		
			while ((linha = br.readLine())!= null){
			
				String[] s = linha.split(";");

			
				lista.add(s[0]);
			
		
			}
			
			String lists = "";
			for(String list : lista){
				
				lists += list+"\n";
			}
			
			JOptionPane.showMessageDialog(null, "Contratos Sem Sinistros: \n\n" + lists);
			
		
		
			br.close();
			}catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "Lista Vázia!");
			}
			
		}
	
	


}
