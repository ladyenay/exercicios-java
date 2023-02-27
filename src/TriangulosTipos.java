import java.util.Scanner;

public class TriangulosTipos {
	public static void main(String[] args) {
		// Programa para descobrir o tipo do triângulo por meio do seus lados ou por
		// meio de seus ângulos.
		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			System.out.println(
					"\nOs triângulos podem ser classificados em relação ao tamanho dos lados (equilátero, isósceles e escaleno) e em relação "
							+ "às medidas de seus ângulos internos (retângulo, acutângulo e obtusângulo).");
			System.out.print(
					"\n \t\t (0) - Encerrar programa \n\t\t (1) - Classificação dos triângulos quanto aos lados \n \t\t (2) - Classificação dos triângulos quanto aos ângulos. \n\nDigite a opção desejada: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Encerrado!!");
				break;
			}

			if (opcao == 1) {
				System.out.println("\n\tOpção (1) escolhida: Classificação dos triângulos quanto aos lados!\n");

				System.out.print("Digite o primeiro lado: ");
				float ladoA = entrada.nextFloat();

				System.out.print("Digite o segundo lado: ");
				float ladoB = entrada.nextFloat();

				System.out.print("Digite o terceiro lado: ");
				float ladoC = entrada.nextFloat();

				// condição de existência de um triângulo, por meio de seus lados.
				if ((ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) && (ladoC + ladoA > ladoB)) {
					if ((ladoA == ladoB) && (ladoA == ladoC) && (ladoB == ladoC)) {
						System.out.println(
								"\nTriângulo Equilátero! Um triângulo é chamado de equilátero se todos os lados possuem a mesma medida.");
					} else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
						System.out.println(
								"\nTriângulo Isósceles! Um triângulo é chamado de isósceles se dois lados possuem a mesma medida.");
					} else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
						System.out.println(
								"\nTriângulo Escaleno! Um triângulo é chamado de escaleno se todos os lados possuem medidas diferentes.");
					}
				} else {
					System.out.println(
							"\n\t --XX-- Não é um triângulo! A medida de um lado é sempre menor que a soma das medidas dos outros dois lados. Essa propriedade é chamada de condição de existência de um triângulo!! --XX--");
				}
			} else if (opcao == 2) {
				System.out.println("\n\tOpção (2) escolhida: Classificação dos triângulos quanto aos ângulos!\n");

				System.out.print("Digite o primeiro ângulo: ");
				float angulo1 = entrada.nextFloat();

				System.out.print("Digite o segundo ângulo: ");
				float angulo2 = entrada.nextFloat();

				System.out.print("Digite o terceiro ângulo: ");
				float angulo3 = entrada.nextFloat();

				// condição de existência de um triângulo, por meio de seus ângulos.
				if (angulo1 + angulo2 + angulo3 == 180) {
					if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)) {
						System.out.println(
								"\nTriângulo Acutângulo! Um triângulo é chamado de acutângulo se todos os ângulos são agudos (<90°).");
					} else if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
						System.out.println(
								"\nTriângulo Retângulo! Um triângulo é chamado de retângulo se possui um ângulo reto (90°).");
					} else if ((angulo1 > 90 && angulo1 < 180) || (angulo2 > 90 && angulo2 < 180)
							|| (angulo3 > 90 && angulo3 < 180)) {
						System.out.println(
								"\nTriângulo Obtusângulo! Um triângulo é chamado de obtusângulo se possui um ângulo obtuso (>90°).");
					}
				} else {
					System.out.println(
							"\n\t --XX-- Não é um triângulo! A soma dos ângulos internos, de qualquer triângulo, deve ser sempre igual a 180°!! --XX--");
				}
			} else {
				System.out.println(" \nOpção Inválida! Digite uma opção válida");
			}
		} while (opcao != 0);

		entrada.close();
	}
}