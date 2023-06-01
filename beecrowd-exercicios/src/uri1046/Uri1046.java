package uri1046;

import java.util.Locale;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt(), horaFinal = sc.nextInt(), duracao = 0;

		if (horaInicial >= horaFinal) {
			duracao = (24 - horaInicial) + horaFinal;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

		sc.close();
	}

}
