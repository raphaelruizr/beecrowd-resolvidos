package uri1051;

import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double totalImposto;

		if (salario > 4500.00) {
			totalImposto = ((salario - 4500.00) * 0.28) + 350.00;
			System.out.printf("R$ %.2f\n", totalImposto);
		} else if (salario > 3000.00) {
			totalImposto = ((salario - 3000.00) * 0.18) + 80.00;
			System.out.printf("R$ %.2f\n", totalImposto);
		} else if (salario > 2000.00) {
			totalImposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f\n", totalImposto);
		} else {
			System.out.println("Isento");
		}

		sc.close();
	}
}
