package applicationProduct;

import java.util.Locale;
import java.util.Scanner;


import entitiesProduct.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + product);//implicitamente vai chamar o toString(), sem o toString() ia retornar (entitiesProduct.Product@2ff4f00f)
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
