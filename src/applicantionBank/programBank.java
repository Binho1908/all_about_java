package applicantionBank;

import java.util.Locale;
import java.util.Scanner;

import entitiesBank.Bank;

public class programBank {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank();
		
		System.out.println("Enter account number: ");
		bank.setAccountNumber(sc.nextInt());
		
		System.out.println("Enter account holder");
		bank.setHolderName(sc.next());
		
		System.out.println("is there an initial deposit (y/n)?");
		char yesOrNot = sc.next().charAt(0);
		
		if(yesOrNot == 'y') {
			System.out.println("Enter initial deposit value: ");
			
			bank.setMoney(sc.nextDouble());
			
			System.out.println("Acount data: ");
			System.out.println(bank);
			
			System.out.print("Enter a deposit value: ");
			Double money = sc.nextDouble();
			bank.addMoney(money);
			
			System.out.println(bank);
			
			System.out.print("Enter a withdraw value: ");
			money = sc.nextDouble();
			bank.removeMoney(money);
			
			System.out.println(bank);
			
		}else {
			System.out.println("parou");
		}
		
	}
}
