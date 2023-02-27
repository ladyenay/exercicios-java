import java.util.Scanner;

public class VotacaoEleicoes {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int idade;

		do {
			System.out.print("\nDigite 0 para encerrar!");
			System.out.print("\nIdade: ");

			idade = teclado.nextInt();
			if (idade == 0) {
				System.out.print("\nPrograma Encerrado!");
				break;
			}
			if (idade < 16) {
				System.out.println("Não Vota!");
			} else if ((idade >= 16 && idade < 18) || (idade > 70)) {
				System.out.println("Votação Opcional!");
			} else if (idade >= 18 && idade <= 70) {
				System.out.println("Votação Obrigatória");
			}
		} while (idade != 0);
		teclado.close();
	}
}
