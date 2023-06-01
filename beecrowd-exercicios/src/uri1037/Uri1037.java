package uri1037;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();

		if (x >= 0 & x <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		if (x > 25 & x <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		if (x > 50 & x <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		if (x > 75 & x <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		if (x < 0 || x > 100) {
			System.out.println("Fora de intervalo");
		}

		sc.close();

	}

}
