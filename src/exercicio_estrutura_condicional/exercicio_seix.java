package exercicio_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_seix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if ( valor > 0 && valor < 25.01) {
			System.out.println("Intervalo [0,25]");
		}
		else if ( valor > 25.00 && valor <= 75.00  ) {
			System.out.println("Intervalo (25,75]");
		}else if ( valor > 75.00 && valor <= 100.00 ) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
		
		
		/*
		JEITO QUE O PROFESSOR FEZ
		
		public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
		
		  */
	}
	
}
