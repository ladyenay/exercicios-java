import java.util.Scanner;

public class TriangulosTipos {
	public static void main(String[] args) {
		// Programa para descobrir o tipo do tri�ngulo por meio do seus lados ou por
		// meio de seus �ngulos.
		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			System.out.println(
					"\nOs tri�ngulos podem ser classificados em rela��o ao tamanho dos lados (equil�tero, is�sceles e escaleno) e em rela��o "
							+ "�s medidas de seus �ngulos internos (ret�ngulo, acut�ngulo e obtus�ngulo).");
			System.out.print(
					"\n \t\t (0) - Encerrar programa \n\t\t (1) - Classifica��o dos tri�ngulos quanto aos lados \n \t\t (2) - Classifica��o dos tri�ngulos quanto aos �ngulos. \n\nDigite a op��o desejada: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Encerrado!!");
				break;
			}

			if (opcao == 1) {
				System.out.println("\n\tOp��o (1) escolhida: Classifica��o dos tri�ngulos quanto aos lados!\n");

				System.out.print("Digite o primeiro lado: ");
				float ladoA = entrada.nextFloat();

				System.out.print("Digite o segundo lado: ");
				float ladoB = entrada.nextFloat();

				System.out.print("Digite o terceiro lado: ");
				float ladoC = entrada.nextFloat();

				// condi��o de exist�ncia de um tri�ngulo, por meio de seus lados.
				if ((ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) && (ladoC + ladoA > ladoB)) {
					if ((ladoA == ladoB) && (ladoA == ladoC) && (ladoB == ladoC)) {
						System.out.println(
								"\nTri�ngulo Equil�tero! Um tri�ngulo � chamado de equil�tero se todos os lados possuem a mesma medida.");
					} else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
						System.out.println(
								"\nTri�ngulo Is�sceles! Um tri�ngulo � chamado de is�sceles se dois lados possuem a mesma medida.");
					} else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
						System.out.println(
								"\nTri�ngulo Escaleno! Um tri�ngulo � chamado de escaleno se todos os lados possuem medidas diferentes.");
					}
				} else {
					System.out.println(
							"\n\t --XX-- N�o � um tri�ngulo! A medida de um lado � sempre menor que a soma das medidas dos outros dois lados. Essa propriedade � chamada de condi��o de exist�ncia de um tri�ngulo!! --XX--");
				}
			} else if (opcao == 2) {
				System.out.println("\n\tOp��o (2) escolhida: Classifica��o dos tri�ngulos quanto aos �ngulos!\n");

				System.out.print("Digite o primeiro �ngulo: ");
				float angulo1 = entrada.nextFloat();

				System.out.print("Digite o segundo �ngulo: ");
				float angulo2 = entrada.nextFloat();

				System.out.print("Digite o terceiro �ngulo: ");
				float angulo3 = entrada.nextFloat();

				// condi��o de exist�ncia de um tri�ngulo, por meio de seus �ngulos.
				if (angulo1 + angulo2 + angulo3 == 180) {
					if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)) {
						System.out.println(
								"\nTri�ngulo Acut�ngulo! Um tri�ngulo � chamado de acut�ngulo se todos os �ngulos s�o agudos (<90�).");
					} else if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
						System.out.println(
								"\nTri�ngulo Ret�ngulo! Um tri�ngulo � chamado de ret�ngulo se possui um �ngulo reto (90�).");
					} else if ((angulo1 > 90 && angulo1 < 180) || (angulo2 > 90 && angulo2 < 180)
							|| (angulo3 > 90 && angulo3 < 180)) {
						System.out.println(
								"\nTri�ngulo Obtus�ngulo! Um tri�ngulo � chamado de obtus�ngulo se possui um �ngulo obtuso (>90�).");
					}
				} else {
					System.out.println(
							"\n\t --XX-- N�o � um tri�ngulo! A soma dos �ngulos internos, de qualquer tri�ngulo, deve ser sempre igual a 180�!! --XX--");
				}
			} else {
				System.out.println(" \nOp��o Inv�lida! Digite uma op��o v�lida");
			}
		} while (opcao != 0);

		entrada.close();
	}
}