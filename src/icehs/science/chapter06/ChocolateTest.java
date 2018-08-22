package icehs.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocoiate choco = new Chocoiate();
		choco.name = "아마도라";
		choco.type = "다크";
		choco.price = 2200;
		
		choco.printChocolateInfo();
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice( 20 );
		System.out.println( chocoName + "초콜랫 20개" + totalPrice);
		choco.changeChoclateInfo( "카페 키리쉬", 2500);
		totalPrice = choco.calculateTotalPrice(15, 10);
		choco.printChocolateInfo();
		System.out.println(choco.name + "초콜릿 15개(10%할인)" + totalPrice + "원");
		choco.changeChoclateInfo("트리플 블랑", "화이트", 2300);
		
	}

}
