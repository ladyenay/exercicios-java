import java.util.Scanner;

public class GenioRandomico {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			int max = 10;
			int min = 1;
			int aleatorio = min + (int) (Math.random() * ((max - min) + 1));

			System.out.print("Fa�a sua aposta, escolha um n�mero entre 1 e 10: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {
				System.out.println("Programa Encerrado!!");
				break;
			}

			if ((opcao > 0) && (opcao <= 10)) {
				if (aleatorio == opcao) {
					System.out.printf("Voc� acertou! O n�mero � %d.\n\n", aleatorio);
				} else {
					System.out.printf("Voc� errou! O n�mero correto � %d.\n\n", aleatorio);
				}
			} else {
				System.out.println("Op��o Inv�lida!\n");
			}
		} while (opcao != 0);
		entrada.close();
	}
}
