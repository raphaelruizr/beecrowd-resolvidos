package uri1117;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float entrada = sc.nextFloat();
		int count = 0;
		float media = 0f;

		while (count < 2) {
			if (entrada < 0 || entrada > 10) {
				System.out.println("nota invalida");
				entrada = sc.nextFloat();
			} else {
				media += entrada;
				count++;
				if (count < 2)
					entrada = sc.nextFloat();
			}
		}

		if (count == 2) {
			media = media / 2;
			System.out.printf("media = %.2f%n", media);
		}

		sc.close();
	}

}
