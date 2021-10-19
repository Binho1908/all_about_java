package triangleSemPoo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		
		System.out.println("Enter the measures of tringle x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of tringle y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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
