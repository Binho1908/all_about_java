package exercicio_estrutura_condicional;

import java.util.Scanner;

public class exercicio_tres {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int z = sc.nextInt();
		
		if(x % z == 0 || z % x == 0 ) 
			System.out.println("Sao Multiplos");
		else 
			System.out.println("NAO Sao Multiplos");
		
		sc.close();
	}
}
