package exercicios_modulo_quatro;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_one {
	
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int soma = a + b;
			
			Locale.setDefault(Locale.US);
			
			System.out.println("SOMA = "+soma);
			
			sc.close();
			
		}
}
