import java.util.Scanner;

public class entrada_de_dados_two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		
		x = sc.nextInt();//Quando voc� usa um comando de  leitura diferente do nextLine() e  d� alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padr�o.Se voc� ent�o fizer um nextLine(),aquela quebra de linha pendente ser� absorvida pelo nextLine().
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}
}