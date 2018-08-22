package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee co = new Coffee();
		
		co.printCoffeeInfo("아메리카노", 3500);
		
		co.printCoffeeInfo("카페라떼", 4000);
		
		co.printCoffeeInfo("마끼아또", 4500);
		
		System.out.println(co.totalPrice);
		
	}

}
