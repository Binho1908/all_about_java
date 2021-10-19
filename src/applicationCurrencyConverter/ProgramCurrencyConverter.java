package applicationCurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

import entitiesCurrencyConverter.CurrencyConverter;

public class ProgramCurrencyConverter {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cv = new CurrencyConverter();
		
		System.out.print("Enter radius: ");
		
		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		
		System.out.println("How many dollar will be bought?");
		double bought = sc.nextDouble();
		
		double c = cv.amouts(price, bought);
		
		System.out.printf("Amount to be paid in reais = %.2f ",c);
		
		
	}
}
