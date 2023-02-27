
import java.util.Scanner;

public class NotaAlunos {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		for (int index = 1; index <= 3; index++) {
			System.out.print("\n__________________________________________\n");
			System.out.print("\nNome aluno(a): ");
			String aluno = entrada.next();

			System.out.printf("\nInforme as três notas do aluno(a) %s", aluno);

			System.out.print("\nNota1: ");
			float nota1 = entrada.nextFloat();

			System.out.print("Nota2: ");
			float nota2 = entrada.nextFloat();

			System.out.print("Nota3: ");
			float nota3 = entrada.nextFloat();

			float media = (nota1 + nota2 + nota3) / 2;

			if (media > 6) {
				System.out.println("\nAPROVADO!");
			} else {
				System.out.println("\nREORVADO!");
			}

			if ((nota1 >= nota2) && (nota1 >= nota3)) {
				System.out.printf("\nA maior nota do aluno(a) %s: %.2f", aluno, nota1);
			} else if ((nota2 >= nota1) && (nota2 >= nota3)) {
				System.out.printf("\nA maior nota do aluno(a) %s: %.2f", aluno, nota2);
			} else if ((nota3 >= nota1) && (nota3 >= nota2)) {
				System.out.printf("\nA maior nota do aluno(a) %s: %.2f", aluno, nota3);
			}

			if ((nota1 <= nota2) && (nota1 <= nota3)) {
				System.out.printf("\nA menor nota do aluno(a) %s: %.2f", aluno, nota1);
			} else if ((nota2 <= nota1) && (nota2 <= nota3)) {
				System.out.printf("\nA menor nota do aluno(a) %s: %.2f", aluno, nota2);
			} else if ((nota3 <= nota1) && (nota3 <= nota2)) {
				System.out.printf("\nA menor nota do aluno(a) %s: %.2f", aluno, nota3);
			}
		}
		entrada.close();
	}
}
