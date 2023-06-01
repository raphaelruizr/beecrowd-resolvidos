package uri1043;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float A = sc.nextFloat(), B = sc.nextFloat(), C = sc.nextFloat();

		float perimetro = A + B + C, area = ((A + B) * C) / 2;

		if (A + B > C & B + C > A & C + A > B) {
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			System.out.printf("Area = %.1f%n", area);
		}

		sc.close();

	}

}
