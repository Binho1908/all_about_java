package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz: ");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Escolha um número: ");
		int e = sc.nextInt();
		int valorE = 0;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if(mat[i][j] == e) {
					valorE++;
				}
			}
		}
		System.out.println("Tem "+valorE+" Numero(s) "+e+" Nesta Matriz");
		
		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == e) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		
		
	}
}
