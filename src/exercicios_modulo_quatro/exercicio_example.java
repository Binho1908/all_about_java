package exercicios_modulo_quatro;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_example {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double precoMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * precoMetroQuadrado;
		Locale.setDefault(Locale.US);
		System.out.printf("Area %.2f %n", area);
		System.out.printf("Preco %.2f %n", preco);
		
		sc.close();
		
	}
}
