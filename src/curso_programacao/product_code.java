package curso_programacao;

import java.util.Scanner;

import entities.product;

public class product_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		product Product = new product(name, price);
	
		System.out.println();
		System.out.println("Product data: " + Product);
		System.out.println();
		System.out.print("Enter the numer of products to be added in stock: ");
		int quantity = sc.nextInt();
		Product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + Product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		Product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + Product);
		
		
		
		sc.close();
	}

}
