package curso_programacao;

import java.util.Scanner;

import entities.Dollar;

public class Dollar_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What is the dollar price? ");
		Dollar.price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		Dollar.dollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", Dollar.converter());
		
		sc.close();
	}

}
