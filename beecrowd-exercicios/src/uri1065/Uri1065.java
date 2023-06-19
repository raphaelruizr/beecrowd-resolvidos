package uri1065;

import java.util.Scanner;

public class Uri1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[5];
		int a = 0;

		for (double x : numeros) {
			x = sc.nextDouble();
			if (x % 2 == 0) {
				a++;
			}
		}
		System.out.println(a + " valores pares");

	}

}
