package uri1114;

import java.util.Scanner;

public class Uri1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		int x = sc.nextInt();

		while (x != senha) {
			System.out.println("Senha Invalida");
			x = sc.nextInt();
		}

		if (x == senha)
			System.out.println("Acesso Permitido");

		sc.close();
	}

}
