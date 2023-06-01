package uri1038;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt(), quantidade = sc.nextInt();
		double total = 0;

		switch (codigo) {

		case 1:
			total = quantidade * 4.0;
			break;

		case 2:
			total = quantidade * 4.5;
			break;

		case 3:
			total = quantidade * 5.0;
			break;

		case 4:
			total = quantidade * 2.0;
			break;

		case 5:
			total = quantidade * 1.5;
			break;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}
