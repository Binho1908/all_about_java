import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ol� mundo!"); // o println tem uma quebra de linha no final
		System.out.println("Ol� mundo!");
		System.out.print("Ol� mundo!"); // n�o tem quebra de linha no final
		System.out.print("Ol� mundo!");
		
		int y = 32; 
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(y);
		
		double x = 10.35784;
		
		System.out.printf("%.2f%n", x); // o %n � somente a quebra de linha
		
		Locale.setDefault(Locale.US); // o programa est� configurado como BR ent�o ele coloca a virgula de vez o ponto, essa instancia muda o local para US, ent�o de vez virgula agora o separador ser� com o ( . ) Obs: os argumentos que ser�o corrigidos tem que estar debaixo desse locale; 
		System.out.println(x);
		System.out.printf("%.2f%n", x); // o %n � somente a quebra de linha
		
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado = "+x);//concatena��o de elementos
		
		
		System.out.printf("Resultado = %.4f metros%n", x);
		
		// %f = ponto flutuante
		
		// %d = inteiro
		
		// %s = texto
		
		// %n = quebra de linha
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
	}

}
