package uri1040;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float N1 = sc.nextFloat(), N2 = sc.nextFloat(), N3 = sc.nextFloat(), N4 = sc.nextFloat(),
				media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

		if (media >= 7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}
		if (media < 5.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}
		if (media >= 5.0 & media < 7.0) {
			float notaExame = sc.nextFloat(), mediaFinal = (media + notaExame) / 2;

			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}

		sc.close();

	}

}
