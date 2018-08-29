package icehs.science.chapter07;

public class Book {
	private String title;
	private int price;
	String ganle;
	
	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	public String getTitle() {
		return title;
	}



	public Book() {
		System.out.println("책이 비어있습니다");
	}
	
	
	public Book() {
		System.out.println("책이 비어있는 ");
	}



	public Book(String title) {
		this.title = title;
		System.out.println("책이름 :" + title +  "임니다.");
	}

	public Book(String title, int price) {
		this(title);
		this.price = price;
	}
	
	public Book(String title, int price, String ganle) {
		this(title, price);
		this.ganle = ganle;
	}

	
	
	void printbook() {
		System.out.println(title);
		System.out.println(price);
	}


}
