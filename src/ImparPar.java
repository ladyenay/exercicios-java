import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;

		do {

			System.out.print("\n\n\t\t --- IMPAR ou PAR ---");
			System.out.print("\nDigite 0 para encerrar o programa!\nDigite um número: ");

			numero = entrada.nextInt();

			String resultado = (numero % 2 == 0) ? "Par" : "Impar";
			System.out.println(resultado);

			/*
			 * if (numero % 2 == 0) { System.out.printf("O número %d é PAR!", numero); }else
			 * { System.out.printf("O número %d é ÍMPAR!", numero); }
			 */

		} while (numero != 0);
		entrada.close();
	}
}
