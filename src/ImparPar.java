import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;

		do {

			System.out.print("\n\n\t\t --- IMPAR ou PAR ---");
			System.out.print("\nDigite 0 para encerrar o programa!\nDigite um n�mero: ");

			numero = entrada.nextInt();

			String resultado = (numero % 2 == 0) ? "Par" : "Impar";
			System.out.println(resultado);

			/*
			 * if (numero % 2 == 0) { System.out.printf("O n�mero %d � PAR!", numero); }else
			 * { System.out.printf("O n�mero %d � �MPAR!", numero); }
			 */

		} while (numero != 0);
		entrada.close();
	}
}
