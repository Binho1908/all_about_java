package exercicios_modulo_quatro;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_dois {
	
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area;
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f",area);
		
		sc.close();
	}
}
