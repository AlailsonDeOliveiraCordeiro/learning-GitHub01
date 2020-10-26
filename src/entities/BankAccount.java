package entities;

public class BankAccount {
		
	private int conta;
	private String name;
	private double saldo;
	
	public BankAccount(int conta, String name, double saldo) {
		this.conta = conta;
		this.name = name;
		this.saldo = saldo;
	}

	public BankAccount(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getConta() {
		return conta;
	}
	
	public double getSaldo () {
		return saldo;
	}

	
	public void deposito (double saldo) {
		this.saldo += saldo;
	}
	
	public void saque (double saldo) {
		this.saldo -= saldo + 5.00;
	}
	
	public String toString () {
		return "Account "
				+ conta
				+ ", Holder: "
				+ this.name
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
	
	
	
	
	
	
	
	
	
	
}
