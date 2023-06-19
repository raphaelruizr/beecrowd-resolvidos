package uri1066;

import java.util.Scanner;

public class Uri1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[5];
		int positivo = 0, negativo = 0, par = 0, impar = 0;

		for (double x : numeros) {
			x = sc.nextDouble();
			if (x > 0) {
				positivo++;
			} else if (x < 0) {
				negativo++;
			}
			if (x % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

	}

}
