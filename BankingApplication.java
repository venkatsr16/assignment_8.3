import java.io.*;

/*public class BankingApplication {
	
	int accountNumber;
	double accountBalance;
	
	public boolean withdraw(double amount){
		double newAccountBalance=1000;
		if(amount>newAccountBalance) {
			System.out.println("Cannot withdraw");
			return false;
		}
		else {
			newAccountBalance = accountBalance-amount;
			accountBalance=newAccountBalance;
			System.out.println("Balance is "+accountBalance);
			return true;
		}
	}
	public boolean deposit(double amount){
		double newAccountBalance=1000;
		if(amount<0.0) {
			System.out.println("Cannot deposit");
			return false;
		}
		else {
			newAccountBalance = accountBalance+amount;
			accountBalance=newAccountBalance;
			System.out.println("Balance is "+accountBalance);
			return true;
		}
	}*/
public class BankingApplication {
	
	int accountNumber;
	double accountBalance;
	
	public synchronized boolean withdraw(double amount){
		double newAccountBalance=1000;
		if(amount>newAccountBalance) {
			System.out.println("Cannot withdraw");
			return false;
		}
		else {
			newAccountBalance = accountBalance-amount;
			accountBalance=newAccountBalance;
			System.out.println("Balance is "+accountBalance);
			return true;
		}
	}
	public synchronized boolean deposit(double amount){
		double newAccountBalance=1000;
		if(amount<0.0) {
			System.out.println("Cannot deposit");
			return false;
		}
		else {
			newAccountBalance = accountBalance+amount;
			accountBalance=newAccountBalance;
			System.out.println("Balance is "+accountBalance);
			return true;
		}
	}
	public static void main(String args[]){
		BankingApplication ba = new BankingApplication();
		ba.deposit(700);
		ba.withdraw(500);
	}
}