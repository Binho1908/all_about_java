package trianguloComPooProgram;

import java.util.Locale;
import java.util.Scanner;
import trianguloComPoo.Triangulo;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		
		System.out.println("Enter the measures of tringle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of tringle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		if(areaX != 0) {
			System.out.printf("Triangle X area: %.4f%n", areaX);
			
		}else {
			System.out.println("Triangulo X: Medidas nao correspondem a um triangulo");
		}
		
		if(areaY != 0) {
			
			System.out.printf("Triangle Y area: %.4f%n", areaY);
		}else {
			System.out.println("Triangulo Y: Medidas nao correspondem a um triangulo");
		}
		
		
		
	}
}