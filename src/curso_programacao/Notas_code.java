package curso_programacao;

import java.util.Scanner;

import entities.Notas;

public class Notas_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Notas notas = new Notas();
		
		notas.name = sc.nextLine();
		notas.n1 = sc.nextDouble();
		notas.n2 = sc.nextDouble();
		notas.n3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", notas.fim());
		
		if (notas.fim() < 60) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points%n", notas.PassFailed());
		} else {
			System.out.println("PASS");
		}
		
		
		sc.close();
	}

}
