package exercicios_modulo_quatro;
import java.util.Locale;
import java.util.Scanner;


public class exercicio_cinco {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, num1, cod2, num2;
		double valor1, valor2;
		
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		double total = (num1 * valor1) + (num2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$%.2f", total);
		System.out.println("codigo da roupa 1: " + cod1);
		System.out.println("codigo da roupa 2: " + cod2);
		
		sc.close();
	}
}
