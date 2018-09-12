package iceh.science.chapter09;

public class Product {
	private String name;
	private int price;
	private int discountRate;
	
	public Product(String name, int price, int dicountRate) {
		super();
		this.name = name;
		this.price = price;
		this.discountRate = dicountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDicountRate() {
		return discountRate;
	}

	public void setDicountRate(int dicountRate) {
		this.discountRate = dicountRate;
	}
	
	public void printProductInfo() {
		System.out.println(this.name);
		System.out.println(this.price + "(" + this.discountRate + ")");
		System.out.println(this.calculateProductPrice());
	}
	
	public int calculateProductPrice() {
		int totalPrice =  price * (100 - discountRate)/100;
		return totalPrice;
	}
}
