package uri1047;

import java.util.Locale;
import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt(), minutoInicial = sc.nextInt(), duracaoHora = 0;
		int horaFinal = sc.nextInt(), minutoFinal = sc.nextInt(), duracaoMinuto = 0;

		if (minutoInicial > minutoFinal) {
			duracaoMinuto = (60 - minutoInicial) + minutoFinal;
		} else if (minutoInicial <= minutoFinal) {
			duracaoMinuto = minutoFinal - minutoInicial;
		}

		if (horaInicial >= horaFinal & minutoInicial >= minutoFinal) {
			duracaoHora = (24 - horaInicial) + horaFinal;

		} else if (horaInicial < horaFinal) {
			duracaoHora = horaFinal - horaInicial;

		}

		if (minutoInicial > minutoFinal) {
			System.out.println("O JOGO DUROU " + (duracaoHora - 1) + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
		} else {
			System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
		}

		sc.close();

	}

}
