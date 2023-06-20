package uri1075;

import java.util.Scanner;

public class Uri1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int x = 1; x <= 10000; x++) {
			if (x % N == 2) {
				System.out.println(x);
			}
		}

		sc.close();
	}

}
