package icehs.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocoiate choco = new Chocoiate();
		choco.name = "�Ƹ�����";
		choco.type = "��ũ";
		choco.price = 2200;
		
		choco.printChocolateInfo();
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice( 20 );
		System.out.println( chocoName + "���ݷ� 20��" + totalPrice);
		choco.changeChoclateInfo( "ī�� Ű����", 2500);
		totalPrice = choco.calculateTotalPrice(15, 10);
		choco.printChocolateInfo();
		System.out.println(choco.name + "���ݸ� 15��(10%����)" + totalPrice + "��");
		choco.changeChoclateInfo("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
	}

}
