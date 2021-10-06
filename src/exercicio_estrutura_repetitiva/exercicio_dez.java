package exercicio_estrutura_repetitiva;

import java.util.Scanner;

public class exercicio_dez {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		
		for(var i = 1; i <= n; i++) {
			System.out.println(i +" " + i * i +" "+ i * i * i  );
		}

		

		sc.close();
	}
}
