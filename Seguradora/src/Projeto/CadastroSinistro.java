package Projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroSinistro {
	
	public void Cadastro() throws IOException {
		
		
	
		
		ArrayList<String> lista = new ArrayList<String>();
		FileReader fr = new FileReader("Cliente2.txt");
		BufferedReader br = new BufferedReader(fr);
		String linha = null;
		

		try{
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String dat = JOptionPane.showInputDialog("Digita a Data: ");
		int per = Integer.parseInt(JOptionPane.showInputDialog("Digite a Porcentagem da perda: "));
		JOptionPane.showMessageDialog(null, "Sinistro Cadastrado");
		
		
		while ((linha = br.readLine())!= null){
			
			String[] s = linha.split(";");
			
			if(!s[0].equals(nome)){
				lista.add(s[0]);
				lista.add(";\n");
			}
			
			
			
		}
		
		FileWriter writer = new FileWriter("cliente2.txt"); 
		for(String str : lista) {
		  writer.write(str);
		}
		writer.close();
		
		FileWriter sin = new FileWriter("Sinistro.txt", true);
		
		BufferedWriter bw = new BufferedWriter(sin);
		
		bw.write("Nome: " + nome + ";");
		bw.write("Data: " + dat + ";");
		bw.write("Porcentagem de perca: " + per + "%;");
		
		
		br.close();
		bw.close();
		
		}catch(NumberFormatException e){
			System.exit(0);
		}
		}

}

