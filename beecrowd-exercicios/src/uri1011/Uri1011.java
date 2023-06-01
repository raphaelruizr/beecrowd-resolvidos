package uri1011;

import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R = sc.nextDouble();
		double pi = 3.14159;
		double VOLUME = (4/3.0)*pi*Math.pow(R, 3.0);
		
		System.out.printf("VOLUME = %.3f%n", VOLUME);
		
		sc.close();

	}

}
