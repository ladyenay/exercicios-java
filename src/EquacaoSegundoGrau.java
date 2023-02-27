import java.util.Scanner;
import java.lang.Math;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {

		System.out.print("Equação do 2° grau: ax² + bx + c = 0 \n\n");
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do coeficiente 'a': ");
		double a = entrada.nextFloat();

		System.out.print("Digite o valor do coeficiente 'b': ");
		double b = entrada.nextFloat();

		System.out.print("Digite o valor do coeficiente 'c': ");
		double c = entrada.nextFloat();

		// solução para delta
		double delta = Math.pow(b, 2) - 4 * a * c;

		// solução para as raízes, caso Δ >= 0
		double x1 = (-b + Math.sqrt(delta)) / 2 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2 * a;

		if (delta < 0) {
			System.out.printf(
					"\nΔ = %.2f, não existe solução real! Em uma euação de 2° grau o Δ não pode ser negativo.", delta);
		} else if (delta == 0) {
			System.out.printf("\nΔ = %.2f, as duas raízes são iguais! \nx1 = %.2f e x2 = %.2f", delta, x1, x2);
		} else if (delta > 0) {
			System.out.printf("\nΔ = %.2f, as duas raízes são diferentes! \nx1 = %.2f e x2 = %.2f", delta, x1, x2);
		}
		entrada.close();
	}
}
