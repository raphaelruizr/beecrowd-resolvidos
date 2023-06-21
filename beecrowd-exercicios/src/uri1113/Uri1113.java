package uri1113;

import java.util.Scanner;

public class Uri1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt();

		while (X != Y) {
			if (X > Y) {
				System.out.println("Decrescente");
			} else if (Y > X) {
				System.out.println("Crescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();
	}

}
