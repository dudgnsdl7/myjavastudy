package iceh.science.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accArr = {
				new Account("111-1111", 10000, 4.5),
				new Account("222-2222", 20000, 4.5),
				new Account("333-3333", 30000, 4.5),
				new Account("444-4444", 40000, 4.5),
				new Account("555-5555", 50000, 4.5),
		};
		for (int i = 0 ; i < accArr.length; i++) {
			System.out.println( accArr[i].getNumbur() + " " + accArr[i].getBalance() + " " + accArr[i].getInterestRate());
		}
		for (int i = 0 ; i <accArr.length; i++) {
			accArr[i].setInterestRate(3.7);
			System.out.println( accArr[i].getNumbur() + " " + accArr[i].getBalance() + " " + accArr[i].getInterestRate());
		}
	}

}
