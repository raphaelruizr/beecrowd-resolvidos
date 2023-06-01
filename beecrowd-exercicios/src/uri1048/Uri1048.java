package uri1048;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float salario = sc.nextFloat(), salarioNovo = 0, reajuste = 0;
		String percentualDeReajuste = "";
		
		if(salario >= 0 & salario <= 400.00) {
			reajuste = (float) (salario * 0.15);
			salarioNovo = salario + reajuste;
			percentualDeReajuste = "15 %";
		}
		if(salario > 400.00 & salario <= 800.00) {
			reajuste = (float) (salario * 0.12);
			salarioNovo = salario + reajuste;
			percentualDeReajuste = "12 %";
		}
		if(salario > 800.00 & salario <= 1200.00) {
			reajuste = (float) (salario * 0.10);
			salarioNovo = salario + reajuste;
			percentualDeReajuste = "10 %";
		}
		if(salario > 1200.00 & salario <= 2000.00) {
			reajuste = (float) (salario * 0.07);
			salarioNovo = salario + reajuste;
			percentualDeReajuste = "7 %";
		}
		if(salario > 2000.00) {
			reajuste = (float) (salario * 0.04);
			salarioNovo = salario + reajuste;
			percentualDeReajuste = "4 %";
		}

		System.out.printf("Novo salario: %.2f%n", salarioNovo);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + percentualDeReajuste);
		sc.close();
	}

}
