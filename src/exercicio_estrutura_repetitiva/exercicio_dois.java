package exercicio_estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x > 0 && y < 0){
				System.out.println("quarto");
			}
			else if(x < 0 && y < 0){
				System.out.println("terceiro");
			}
			else if(x < 0 && y > 0){
				System.out.println("segundo");
			}
			
			y = sc.nextInt();
			x = sc.nextInt();
		}
		System.out.println("");

		sc.close();
	}

}
