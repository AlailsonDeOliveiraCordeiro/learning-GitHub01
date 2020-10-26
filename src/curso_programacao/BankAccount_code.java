package curso_programacao;

import java.util.Scanner;

import entities.BankAccount;

public class BankAccount_code {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 
	 double saldo = 0;
	 BankAccount bank;
	 System.out.print("Enter account number: ");
	 int conta = sc.nextInt();
	 System.out.print("Enter account holder: ");
	 String name = sc.next();
	 System.out.print("Is there an initial deposit (y/n)? ");
	 sc.nextLine();
	 char resposta = sc.next().charAt(0);
	
	 if (resposta == 'y') {
		  System.out.print("Enter initial deposit value: ");
		  saldo = sc.nextDouble();
		  bank = new BankAccount(conta, name, saldo);
	 } else {
		  bank = new BankAccount(conta, name);
	 }
	  
	 System.out.println("Account data: ");
	 System.out.println(bank);
	 
	 System.out.print("Enter a deposit value: ");
	 saldo = sc.nextDouble();
	 bank.deposito(saldo);
	 System.out.println("Updated account data: ");
	 System.out.println(bank);
	 
	 System.out.print("Enter a withdraw value: ");
	 saldo = sc.nextDouble();
	 bank.saque(saldo);
	 System.out.println("Updated account data: ");
	 System.out.println(bank);
 

	 sc.close();

	}

}
