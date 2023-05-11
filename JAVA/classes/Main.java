package classes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		do {
			String strEscolha = "";
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("1- Testar deque");
			System.out.println("2- Testar fila");
			System.out.println("3- Testar pilha");
			System.out.println("Digite -1 para sair");
			System.out.print("\nEscolha:");
			strEscolha = scan.nextLine();

			switch (Integer.valueOf(strEscolha)) {
			case 1:
				testDeck();
				break;
			case 2:
				testFila();
				break;
			case 3:
				testPilha();
				break;
			case -1:
				System.exit(0);
			default:
				System.out.println("Opcao invalida.");
			}
		} while (true);

	}

	private static void testFila() {
		Fila<String> fila = new Fila<>();

		// testar add
		fila.add("Primeiro");
		fila.add("Segundo");
		fila.add("Terceiro");
		System.out.println(fila);

		// testar remove
		fila.remove();
		fila.remove();
		System.out.println(fila); // deve so o t

	}

	private static void testPilha() {
		Pilha<String> pilha = new Pilha<>();

		// testar add
		pilha.add("Primeiro");
		pilha.add("Segundo");
		pilha.add("Terceiro");
		System.out.println(pilha);

		// testar remove
		pilha.remove();
		pilha.remove();
		System.out.println(pilha); // deve so o primeiro
	}

	private static void testDeck() {
		// testar add
		Deque<String> deque = new Deque<>();
		deque.addPrimeiro("Primeiro");
		deque.addPrimeiro("Antes do primeiro");
		deque.addUltimo("Ultimo");
		deque.addUltimo("Depois do ultimo");
		// antes do primeiro primeiro ultimo depois do ultimo

		System.out.println(deque);

		// testar remove
		deque.removePrimeiro();
		deque.removeUltimo();

		System.out.println(deque);

	}
}
