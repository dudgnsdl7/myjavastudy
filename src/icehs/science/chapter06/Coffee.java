package icehs.science.chapter06;

public class Coffee {
	
	int totalPrice;
	
	void printCoffeeInfo(String name, int price) {
		System.out.println( name +" " + price);
		totalPrice += price;
	}
}
