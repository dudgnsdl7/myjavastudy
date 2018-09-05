package iceh.science.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate[] choco = new Chocolate[3];
		choco[0] = new Chocolate("아마도라", "다크", 2200);
		choco[1] = new Chocolate("카페 기리쉬", "다크", 2500);
		choco[2] = new Chocolate("트리플 블랑", "화이트", 2300);
		
		/*choco[0].printChocolateInfo();
		choco[2].printChocolateInfo();
		choco[3].printChocolateInfo();*/
		int totalPrice = 0;
		for(int i = 0; i < choco.length; i++) {
			choco[i].printChocolateInfo();
			if(choco[i].getType().equals("화이트")){
				totalPrice = totalPrice + choco[i].getPrice() / 100 * 80;
			}
			else {
				totalPrice += choco[i].getPrice();
			}
		}
		
		System.out.println("하나씩 구매했을때 퐁 가격 : " + totalPrice);
	}

}
