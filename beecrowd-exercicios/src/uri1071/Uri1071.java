package uri1071;

import java.util.Scanner;

public class Uri1071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt(), Y = sc.nextInt();
		int soma = 0;

		if (X != Y) {
			if (X > Y) {
				while (X > Y) {
					Y++;
					if (Y == X) {
						break;
					} else if (!(Y % 2 == 0)) {
						soma += Y;
					}
				}
			} else if (Y > X) {
				while (Y > X) {
					X++;
					if (X == Y) {
						break;
					} else if (!(X % 2 == 0)) {
						soma += X;
					}
				}
			}
		} else {
			soma = 0;
		}
		System.out.println(soma);
		sc.close();
	}
}
