
import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompra {
	public static void main(String[] args) {

		int opcao;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();

		do {
			System.out.println("\n0- Sair \t 1- Listar \t 2- Adicionar \t 3- Excluir");
			System.out.println("\nDigite aqui: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Encerrado!");
				break;
			}

			switch (opcao) {

			case 1: {

				for (int i = 0; i < lista.size(); i++) {
					System.out.printf("%d - %s\n", i + 1, lista.get(i));
				}

				/*
				 * outra opcao para instrução for: int index = 0; for (String string : lista)
				 * { System.out.println(index +1 + " - " + string); index++; }
				 */
				break;
			}

			case 2: {
				int escolha;
				do {
					System.out.println("\nDigite o nome do item: ");
					String item = entrada.next();
					lista.add(item);

					System.out.println("\nDeseja continuar adicionando items? \t 1- Sim \t 2- Não ");
					escolha = entrada.nextInt();
				} while (escolha == 1);

				break;
			}

			case 3: {
				System.out.println("\nDigite o número do item: ");
				int numero = entrada.nextInt();
				lista.remove(numero - 1);
				break;
			}
			}

		} while (opcao != 0);
		entrada.close();
	}
}
