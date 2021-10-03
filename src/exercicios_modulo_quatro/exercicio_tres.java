package exercicios_modulo_quatro;

import java.util.Scanner;

public class exercicio_tres {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int multUm = a * b;
		int multDois = c * d;
		
		int diferenca = multUm - multDois;
		
		System.out.println("DIFERENCA = "+diferenca);
		
		sc.close();
	}
}
