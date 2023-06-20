package uri1079;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int x = 1; x <= N; x++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("%.1f\n", media);
		}

		sc.close();
	}
}
