package icehs.science.chapter06;

public class Account {
	String name;
	String accNo;
	int balance;
	
	void deposit(int money) {
		System.out.println(money + "원을 입금합니다.");
		balance += money; 
	}
	
	void withdraw(int money) {
		System.out.println(money + "원을 출금합니다");
		balance -= money;
	}
	
	void printkAccount() {
		System.out.println("예금주 : " + name + "(계좌번호 :" + accNo+ ")");
		System.out.println("잔액 : " + balance);
	}
	
	void printBalance () {
		System.out.println("잔액 : " + balance);
	}
}
