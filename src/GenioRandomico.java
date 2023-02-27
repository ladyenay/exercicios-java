import java.util.Scanner;

public class GenioRandomico {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			int max = 10;
			int min = 1;
			int aleatorio = min + (int) (Math.random() * ((max - min) + 1));

			System.out.print("Faça sua aposta, escolha um número entre 1 e 10: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {
				System.out.println("Programa Encerrado!!");
				break;
			}

			if ((opcao > 0) && (opcao <= 10)) {
				if (aleatorio == opcao) {
					System.out.printf("Você acertou! O número é %d.\n\n", aleatorio);
				} else {
					System.out.printf("Você errou! O número correto é %d.\n\n", aleatorio);
				}
			} else {
				System.out.println("Opção Inválida!\n");
			}
		} while (opcao != 0);
		entrada.close();
	}
}
