package uri1042;

import java.util.Locale;
import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		if (a < b & a < c) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b + "\n" + c);
			} else {
				System.out.println(c + "\n" + b);
			}
		}

		if (b < a & b < c) {
			System.out.println(b);
			if (a < c) {
				System.out.println(a + "\n" + c);
			} else {
				System.out.println(c + "\n" + a);
			}
		}

		if (c < a & c < b) {
			System.out.println(c);
			if (a < b) {
				System.out.println(a + "\n" + b);
			} else {
				System.out.println(b + "\n" + a);
			}
		}

		System.out.println("");
		System.out.println(a + "\n" + b + "\n" + c + "\n");

		sc.close();

	}

}
