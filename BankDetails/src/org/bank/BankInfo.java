package org.bank;

public class BankInfo {
	public void savings() {
		System.out.println("Saving Accounts");
	}
	public void fixed() {
		System.out.println("Fixed Account");
	}
	public void deposit() {
		System.out.println("Deposit 5%");

	}
	
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		bi.savings();
		bi.fixed();
		bi.deposit();
	}
	

}
