package uri1064;

import java.util.Scanner;

public class Uri1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[6];
		int contador = 0;
		double somaPositivo = 0;
		double media;
		
		for (double x : numeros) {
			x = sc.nextDouble();
			if (x > 0) {
				contador++;
				somaPositivo += x;
			}
		}
		media = somaPositivo/contador;
		System.out.println(contador + " valores positivos");
		System.out.printf("%.1f\n",media);

	}

}
