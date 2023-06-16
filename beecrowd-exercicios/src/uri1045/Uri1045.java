package uri1045;

import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float x = sc.nextFloat(), y = sc.nextFloat(), z = sc.nextFloat();
		float A = 0, B = 0, C = 0;

		if (x >= y & x >= z) {
			A = x;
			if (y >= z) {
				B = y;
				C = z;
			} else {
				B = z;
				C = y;
			}
		}

		if (y >= x & y >= z) {
			A = y;
			if (x >= z) {
				B = x;
				C = z;
			} else {
				B = z;
				C = x;
			}
		}

		if (z >= x & z >= y) {
			A = z;
			if (x >= y) {
				B = x;
				C = y;
			} else {
				B = y;
				C = x;
			}
		}

		if (A > B + C || A == B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((A * A) == (B * B) + (C * C)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ((A * A) > (B * B) + (C * C)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if ((A * A) < (B * B) + (C * C)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (A == B & B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((A == B & B != C) || (B == C & C != A) || (C == A & A != B)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		sc.close();

	}

}
