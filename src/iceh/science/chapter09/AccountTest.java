package iceh.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundAccount acc = new FundAccount();
		acc.setNumber("111-2222");
		acc.setBalance(500000);
		acc.setName("È«±æµ¿");
		acc.setEarningRate(4.7);
		
		acc.openAccount();
		System.out.println("°³ÁÂ¹øÈ£ :" + acc.getNumber());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
		System.out.println(acc.getEarningRate());
		acc.earnMoney();
		
	}

}
