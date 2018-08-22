package icehs.science.chapter06;

public class Chocoiate {
	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	
	int calculateTotalPrice( int count ) {
		return count * price;
	}
	
	int calculateTotalPrice(int count, int discount) {
		return count * price * (100-discount)/100;
	}
	

	void changeChoclateInfo( String newName, int newPrice) {
		name = newName;
		price = newPrice;
	}
	
	void changeChoclateInfo( String newName, String newType, int newPrice) {
		name = newName;
		type = newType;
		price = newPrice;
	}
	
	void printChocolateInfo() {
		System.out.println( "이름 :" + name + ", 종류 :" +type + ", 가격 :" + price);
	}
}
