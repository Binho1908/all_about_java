import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá mundo!"); // o println tem uma quebra de linha no final
		System.out.println("Olá mundo!");
		System.out.print("Olá mundo!"); // não tem quebra de linha no final
		System.out.print("Olá mundo!");
		
		int y = 32; 
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(y);
		
		double x = 10.35784;
		
		System.out.printf("%.2f%n", x); // o %n é somente a quebra de linha
		
		Locale.setDefault(Locale.US); // o programa está configurado como BR então ele coloca a virgula de vez o ponto, essa instancia muda o local para US, então de vez virgula agora o separador será com o ( . ) Obs: os argumentos que serão corrigidos tem que estar debaixo desse locale; 
		System.out.println(x);
		System.out.printf("%.2f%n", x); // o %n é somente a quebra de linha
		
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado = "+x);//concatenação de elementos
		
		
		System.out.printf("Resultado = %.4f metros%n", x);
		
		// %f = ponto flutuante
		
		// %d = inteiro
		
		// %s = texto
		
		// %n = quebra de linha
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
	}

}
