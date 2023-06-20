package uri1078;

import java.util.Scanner;

public class Uri1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int x = 1; x <= 10; x++) {
			System.out.println(x + " x " + N + " = " + (x * N));
		}

		sc.close();
	}

}
