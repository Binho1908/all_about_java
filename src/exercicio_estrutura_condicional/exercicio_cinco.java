package exercicio_estrutura_condicional;

import java.util.Scanner;

public class exercicio_cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco;
		
		
		if(codigo == 1) {
			preco = 4.00;
		}else if(codigo == 2) {
			preco = 4.50;
		}else if(codigo == 3) {
			preco = 5.00;
		}else if(codigo == 4) {
			preco = 2.00;
		}else {
			preco = 1.50;
		}
		
		double total = quantidade * preco;
		
		System.out.printf("Total: R$ %.2f ",total);
		
		sc.close();
		
	}

}
