package Projeto;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContratoEmpresarial {
	
	
	public void Cadastro() throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		
		double b;
		int i = 0;
		
		String nome = JOptionPane.showInputDialog("Digite o nome da Empresa: ");

		int val = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor do imóvel: "));
		int func = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de funcionarios: "));
		int vd = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de visitas diarias: "));
		int ram = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ramo em que a sua empresa está (1) Comercio, (2) Industria, (3) Agropecuaria:  "));
		
		String ramo = "";
		switch(ram){
		case 1:
			ramo = "Comercio";
		case 2:
			ramo = "Industria";
		case 3:
			ramo = "Agropecuaria";
		}
		
		
		b = (val) * 0.04;
		
		for(int cont = 0; cont <= func ; cont++){
			
			if(i == 10){
				b += (val) * 0.002;
				i = 0;
			}
			i++;
		}
		
		i = 0;
		for(int cont = 0; cont <= vd ; cont++){
			
			if(i == 200){
				b += (val) * 0.003;
				i = 0;
			}
			i++;
		}
		
		switch(ram){
		case 1:
			b += (val) * 0.005;
			break;
		case 2:
			b += (val) * 0.01;
			break;
		}
		
		
		JOptionPane.showMessageDialog(null, "\n\n Valor do Seguro: " + b);
		
		FileWriter cli = new FileWriter("Cliente.txt", true);
		FileWriter cli2 = new FileWriter("Cliente2.txt", true);
		
		BufferedWriter bw = new BufferedWriter(cli);
		BufferedWriter bw2 = new BufferedWriter(cli2);
		
		bw.write("Nome:" + nome + ";");
		bw.write("Valor:" + val + ";");
		bw.write("Numero Funcionários:" + func + ";");
		bw.write("Numero de visitas por dia:" + vd + ";");
		bw.write("Ramo:" + ramo  + ";");
		bw.write("Valor Seguro: " + b + ";\n");
		bw2.write(nome + ";");
		bw2.write("\n");
		
		sc.close();
		bw.close();
		bw2.close();
	}
	

}

