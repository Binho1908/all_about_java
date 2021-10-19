package applicationAluno;

import java.util.Locale;
import java.util.Scanner;

import entitiesAluno.Aluno;

public class programAluno {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome: ");
		
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite as pontuações das notas");
		
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE %.2f %n", aluno.somaNota());
		
		if (aluno.somaNota() < 60) {
			System.out.println("FAILED");
			Double missing = 60 - aluno.somaNota();
			System.out.printf("Missing %.2f Points", missing);
		}else {
			System.out.println("PASS");
		}
		
		
		
	}
}
