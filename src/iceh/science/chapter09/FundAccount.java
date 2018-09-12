package iceh.science.chapter09;

public class FundAccount extends Account{
	private Double earningRate;

	

	public FundAccount(String number, String name, int balance, Double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public Double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(Double earningRate) {
		this.earningRate = earningRate;
	}
	
	public void earnMoney() {
		System.out.println("수익이 발생했습니다.");
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		System.out.println(this.getNumber());
		System.out.println(this.getName());
		System.out.println(this.getBalance());
		System.out.println(this.earningRate);
	}
}
