package matriz;

import java.util.Locale;
import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println("Diagonal principal: ");
		for(int i=0; i<n; i++) {
			System.out.println(mat[i][i]+" ");
		}
		
		System.out.println("Negative numbers: ");
		int res = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					res++;
				}
			}
		}
		System.out.println(res);
		
		
		
		
		
	}
	
	
	
	
}
