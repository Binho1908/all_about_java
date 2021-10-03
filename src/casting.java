
public class casting {
	public static void main(String[] args) {
		
		/*Boa prática: 
		Sempre indique o tipo do número, se a 
		expressão for de ponto flutuante (não 
		inteira).
		Para double use: 
		.0
		Para float use:
		.f
		*/
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println("Area = "+area);
		
		
		// Jeito Certo
		int c, d;
		double resultado;
		c = 5;
		d = 2;
		resultado = (double) c / d;
		System.out.println(resultado);
		
		/*
		 Vai dar errado pois esta dividindo dois inteiros sem falar que você um double de resultado
		 int c, d;
		double resultado;
		c = 5;
		d = 2;
		resultado = c / d;
		System.out.println(resultado);
		*/
	}
}
