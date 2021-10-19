package applicationRetangle;

import java.util.Locale;
import java.util.Scanner;
import entitesRetangle.Retangle;

public class ProgramRetangle {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangle retangle = new Retangle();
		
		System.out.println("Enter rectangle width and height: ");
		retangle.height = sc.nextDouble();
		retangle.width = sc.nextDouble();
		
		System.out.println("Area = "+retangle.area());
		
		System.out.println("Perimetro = "+retangle.perimeter());
		
		System.out.println("Diagonal = "+retangle.diagonal());
		
		
	}
}
