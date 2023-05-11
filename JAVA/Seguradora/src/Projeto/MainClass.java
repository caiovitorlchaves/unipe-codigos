package Projeto;

import java.io.IOException;

import javax.swing.JOptionPane;

public class MainClass {
	
	public static void main(String[] args) throws IOException {
		
		int op = 0;
		String firstOp;
		wl: while (true) {
			firstOp = JOptionPane.showInputDialog(
						"Selecione uma opção: \n\n" + 
						"1  --  Cadastrar Cliente Fisico\n" + 
					       "2  --  Cadastrar Cliente Juridico\n" + 
						"3 -- Cadastrar Sinistro\n" +
					       "4 -- Lista Sinistro\n" +
						"5 -- Lista Cliente\n" +
					       "6 -- Lista Contrato Sem Sinistro\n" +
						"7 -- Lista Contratos\n" + 
						"8  --  Sair\n");
			try{
			for(int i = 0; i < firstOp.length(); i++){
				
				char c = firstOp.charAt(i);
				 if (Character.isDigit(c)) {
					 op = Integer.parseInt(firstOp);
                     

               }else{
            	   JOptionPane.showMessageDialog(null, "Digite um numero!", "ERRO", JOptionPane.ERROR_MESSAGE);
            	   continue wl;
            	   
               }
			}
			
			
			
				
			
			
			
			
			switch (op) {
				case 1:
					ContratoResidencial cl = new ContratoResidencial();
					cl.Cadastro();
					break;
				case 2:
					ContratoEmpresarial con = new ContratoEmpresarial();
					con.Cadastro();
					break;
				case 3:
					CadastroSinistro si = new CadastroSinistro();
					si.Cadastro();
					break;
				case 4:
					ListaSinistro li = new ListaSinistro();
					li.lista();
					break;
				case 5:
					ListaCliente lii = new ListaCliente();
					lii.lista();
					break;
				case 6:
					ListaContratoSemSinistro liii = new ListaContratoSemSinistro();
					liii.lista();
					break;
				case 7:
					ListaContratos lc = new ListaContratos();
					lc.lista();
					break;

				case 8:
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, 
						op + " é uma opção Invalida!", "ERRO", 
						JOptionPane.ERROR_MESSAGE );
				}
				
			}catch(NullPointerException c){
				return;
			}catch(NumberFormatException e){
				return;
			}

		}

		
		
		
		
	}
	}