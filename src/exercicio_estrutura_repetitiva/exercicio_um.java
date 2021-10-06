package exercicio_estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		while(i != 2002) {
			System.out.println("Senha Invalida");
			i = sc.nextInt();
			
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
