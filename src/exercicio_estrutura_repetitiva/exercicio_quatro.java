package exercicio_estrutura_repetitiva;

import java.util.Scanner;

public class exercicio_quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i < x; i += 2 ) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
