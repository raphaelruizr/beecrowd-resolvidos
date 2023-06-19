package uri1067;

import java.util.Scanner;

public class Uri1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		for (int x = 1; x <= valor; x++) {
			if (!(x % 2 == 0)) {
				System.out.println(x);
			}
		}

		sc.close();
	}

}
