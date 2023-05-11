package exercicio;

	import java.util.ArrayList;
	import java.util.List;
	public class Questao7 {
		public static int aprovados = 0;
		public static int reprovados = 0;
		public static int exame = 0;
		public static void main(String args[]) {
			List<Aluno> lista = new ArrayList<Aluno>();
			lista.add(new Aluno(10, 5));
			lista.add(new Aluno(7, 5));
			lista.add(new Aluno(4, 9));
			lista.add(new Aluno(2, 10));
			lista.add(new Aluno(1, 9));
			lista.add(new Aluno(3, 6));
			System.out.println("Média de cada aluno.");
			for (int i = 0; i < lista.size(); i++) {
				double media = Questao7.media(lista.get(i));
				System.out.println("Média do Aluno " + (i + 1) + ": " + media);
				System.out.println("Situação: " + Questao7.situacao(media));
			}
			System.out.println("Total de aprovados: " + Questao7.aprovados);
			System.out.println("Total de reprovados: " + Questao7.reprovados);
			System.out.println("Total de exame: " + Questao7.exame);
			System.out.println("Media da classe: " + Aluno.media / lista.size());
		}
		public static double media(Aluno aluno) {
			Aluno.media += (aluno.nota1 + aluno.nota2) / 2;
			return (aluno.nota1 + aluno.nota2) / 2;
		}
		public static String situacao(double media) {
			if (media < 3) {
				Questao7.reprovados = Questao7.reprovados + 1;
				return "Reprovado!";
			} else if (media > 7) {
				Questao7.aprovados = Questao7.aprovados + 1;
				return "Aprovado!";
			} else
				Questao7.exame = Questao7.exame + 1;
			return "Exame!";
		}
	}
	class Aluno {
		public double nota1;
		public double nota2;
		public static double media = 0;
		public Aluno(double nota1, double nota2) {
			this.nota1 = nota1;
			this.nota2 = nota2;
		}
	}


