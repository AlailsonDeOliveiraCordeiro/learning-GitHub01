package curso_programacao;

import java.util.Scanner;

import entities.Employee;

public class Employee_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: "+ employee);
		System.out.println();
		System.out.print("Which percentage to increase the salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		System.out.println();
		System.out.print("Updated data: " + employee);
		
		
		
		sc.close();

	}

}
