package exercicio_estrutura_repetitiva;

import java.util.Scanner;

public class exercicio_cinco {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			if(a >= 10 && a <= 20 ) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.println(in +" in");
		System.out.println(out +" out");

		sc.close();

	}

}
