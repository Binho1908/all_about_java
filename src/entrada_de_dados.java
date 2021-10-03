import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		//ler uma string
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: "+x);
		
		
		
		//ler um double
		Scanner tc = new Scanner(System.in);
		double f;
		f = tc.nextDouble();
		System.out.println("Você digitou: "+f);
		
		
		//ler um int
		Scanner ec = new Scanner(System.in);
		int a;
		a = ec.nextInt();
		System.out.println("Você digitou: "+a);
		
		
		//ler um char
		Scanner cc = new Scanner(System.in);
		char b;
		b =	 sc.next().charAt(0);
		System.out.println("Você digitou: "+ b);
		
		//DIGITAR TUDO NA MESMA LINHA
		String q;
		int w;
		double e;
		
		q = tc.next();
		w = tc.nextInt();
		e = tc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		
		
		sc.close();
		tc.close();
		ec.close();
		cc.close();
		tc.close();
		
	}

}
