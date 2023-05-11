package Projeto;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ContratoResidencial {
	
	
	public void Cadastro() throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		try{
			
		
		
		
		double a;
		
	
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		fe: for(int i = 0; i < 1; i++){
			
			char c = nome.charAt(i);
			 if (Character.isAlphabetic(c)) {
				 break fe;
				 

           }else{
        	   JOptionPane.showMessageDialog(null, "Digite letras!", "ERRO", JOptionPane.ERROR_MESSAGE);
        	   nome = JOptionPane.showInputDialog("Digite seu nome: ");
        	   continue fe;
        	   
           }
		}
		
		String endereco = JOptionPane.showInputDialog("Digite seu Endereço: ");
		fe: for(int i = 0; i < 1; i++){
			
			char c = endereco.charAt(i);
			 if (Character.isAlphabetic(c)) {
				 break fe;
				 

           }else{
        	   JOptionPane.showMessageDialog(null, "Digite letras!", "ERRO", JOptionPane.ERROR_MESSAGE);
        	   endereco = JOptionPane.showInputDialog("Digite seu Endereço: ");
        	   continue fe;
        	   
           }
		}
		String val1 = JOptionPane.showInputDialog("Digite o Valor do imóvel: ");
		int val = 0;
		fe: for(int i = 0; i < 1; i++){
			
			char c = val1.charAt(i);
			 if (Character.isDigit(c)) {
				 val = Integer.parseInt(val1);
				 
				 break fe;
				 

           }else{
        	   JOptionPane.showMessageDialog(null, "Digite numeros!", "ERRO", JOptionPane.ERROR_MESSAGE);
        	   val1 = JOptionPane.showInputDialog("Digite o Valor do imóvel: ");
        	   continue fe;
        	   
           }
		}
		String zon1 = JOptionPane.showInputDialog("Digite a Zona em que o imovel está (1) urbana, (2) Suburbana, (3) Rural: ");
		int zon = 0;
		fe: for(int i = 0; i < 1; i++){
			
			char c = zon1.charAt(i);
			 if (Character.isDigit(c)) {
				 zon = Integer.parseInt(zon1);
				 break fe;
				 

           }else{
        	   JOptionPane.showMessageDialog(null, "Digite numeros!", "ERRO", JOptionPane.ERROR_MESSAGE);
        	   zon1 = JOptionPane.showInputDialog("Digite a Zona em que o imovel está (1) urbana, (2) Suburbana, (3) Rural: ");
        	   continue fe;
        	   
           }
		}
		
		String res1 = JOptionPane.showInputDialog("Digite o tipo de residencia (1) Apartamento, (2) Casa: ");
		int res = 0;
		fe: for(int i = 0; i < 1; i++){
			
			char c = res1.charAt(i);
			 if (Character.isDigit(c)) {
				 res = Integer.parseInt(res1);
				 break fe;
				 

           }else{
        	   JOptionPane.showMessageDialog(null, "Digite numeros!", "ERRO", JOptionPane.ERROR_MESSAGE);
        	   res1 = JOptionPane.showInputDialog("Digite o tipo de residencia (1) Apartamento, (2) Casa: ");
        	   continue fe;
        	   
           }
		}
		String zona = "";
		String resi = "";
		
		switch(zon){
		case 1:
			zona = "Urbana";
			break;
		case 2:
			zona = "Suburbana";
			break;
		case 3:
			zona = "Rural";
			
		}
		
		switch(res){
		case 1:
			resi = "Apartamento";
			break;
		case 2:
			resi = "Casa";
		}

		a = (val) * 0.02;
		
		switch(zon){
		case 1:
			a += (val) * 0.01;
			break;
		case 2:
		case 3:
			a += (val) * 0.005;
		}
		

		JOptionPane.showMessageDialog(null, "Valor do Seguro: " + a);
		
		
		FileWriter cli = new FileWriter("Cliente.txt", true);
		FileWriter cli2 = new FileWriter("Cliente2.txt", true);
		
		BufferedWriter bw = new BufferedWriter(cli);
		BufferedWriter bw2 = new BufferedWriter(cli2);
		
		

		bw.write("Nome: " + nome + ";");
		bw.write("Endereço: " + endereco + ";");
		bw.write("valor: " +  val + ";");
		bw.write("zona: " + zona + ";");
		bw.write("residencia: " + resi + ";");
		bw.write("Valor Seguro: " + a + ";\n");
		bw2.write(nome + ";");
		bw2.write("\n");
	
		
		sc.close();
		bw.close();
		bw2.close();
		}catch(NumberFormatException e){
			System.exit(0);
		}
		
		
		
	}
	
	
	
}
