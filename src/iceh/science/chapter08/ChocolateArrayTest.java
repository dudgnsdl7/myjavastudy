package iceh.science.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate[] choco = new Chocolate[3];
		choco[0] = new Chocolate("�Ƹ�����", "��ũ", 2200);
		choco[1] = new Chocolate("ī�� �⸮��", "��ũ", 2500);
		choco[2] = new Chocolate("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
		/*choco[0].printChocolateInfo();
		choco[2].printChocolateInfo();
		choco[3].printChocolateInfo();*/
		int totalPrice = 0;
		for(int i = 0; i < choco.length; i++) {
			choco[i].printChocolateInfo();
			if(choco[i].getType().equals("ȭ��Ʈ")){
				totalPrice = totalPrice + choco[i].getPrice() / 100 * 80;
			}
			else {
				totalPrice += choco[i].getPrice();
			}
		}
		
		System.out.println("�ϳ��� ���������� �� ���� : " + totalPrice);
	}

}
