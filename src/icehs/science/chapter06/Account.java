package icehs.science.chapter06;

public class Account {
	String name;
	String accNo;
	int balance;
	
	void deposit(int money) {
		System.out.println(money + "���� �Ա��մϴ�.");
		balance += money; 
	}
	
	void withdraw(int money) {
		System.out.println(money + "���� ����մϴ�");
		balance -= money;
	}
	
	void printkAccount() {
		System.out.println("������ : " + name + "(���¹�ȣ :" + accNo+ ")");
		System.out.println("�ܾ� : " + balance);
	}
	
	void printBalance () {
		System.out.println("�ܾ� : " + balance);
	}
}
