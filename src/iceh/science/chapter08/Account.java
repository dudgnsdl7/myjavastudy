package iceh.science.chapter08;

public class Account {
	private String numbur;
	private int balance;
	private double interestRate;
	public Account(String numbur, int balance, double interestRate) {
		super();
		this.numbur = numbur;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getNumbur() {
		return numbur;
	}
	public void setNumbur(String numbur) {
		this.numbur = numbur;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int calculateInterest() { 
		return (int)(this.balance + balance*interestRate );
	}
}