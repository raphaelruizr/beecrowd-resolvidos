package uri1070;

import java.util.Scanner;

public class Uri1070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int contador = 0;

		do {
			if (!(X % 2 == 0)) {
				System.out.println(X);
				contador++;
			}
			X++;
		} while (contador < 6);

		sc.close();
	}
}
