package iceh.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] subjects = {"����", "����" , "����"};
		int [] scores= new int[3];
		
		scores[0] = 93 ;
		scores[1] = 87;
		scores[2] =  90;

		/*System.out.println("���� :" + scores[0] );
		System.out.println("���� :" + scores[1] );
		System.out.println("���� :" + scores[2] );*/
		for(int i = 0; i < scores.length; i++)
			System.out.println();
		System.out.println("��� :" + (double)(scores[0] + scores[1] + scores[2])/3 );
	}

}
