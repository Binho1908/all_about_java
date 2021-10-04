package estrutura_condicional;
 
import java.util.Scanner;

public class expressao_comparativa_and_estrutura_condicional {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		
		if(x >= 6 && x < 12) {
			System.out.println("Bom dia");
		}else if (x >= 12 && x < 18 ){
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite");
		}
		
		sc.close();
		
	}
}
