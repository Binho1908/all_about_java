package exercicios_modulo_quatro;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_quatro {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int func = sc.nextInt();
		double horas = sc.nextDouble();
		double dinheiroHora = sc.nextDouble();
		double salary = horas * dinheiroHora;
		
		System.out.println("NUMBER = "+func);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}
}
