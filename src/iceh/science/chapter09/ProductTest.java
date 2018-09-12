package iceh.science.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("통돌이",450000,8);
		p1.printProductInfo();
		Television p2 = new Television("씨내마 ",3500000,10,"151cm");
		p2.printProductInfo();
		System.out.println(p2.getDescription());
	}

}
