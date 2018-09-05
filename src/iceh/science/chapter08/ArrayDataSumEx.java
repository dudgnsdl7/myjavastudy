package iceh.science.chapter08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 10, 21, 33, 42, 51, 64, 79, 80};
		int sum = 0;
		
		System.out.print("배열의 각 요소 : ");
		
		for (int i = 0; i < numbers.length; i++){
			if(numbers[i] % 2 == 1) {
			System.out.print( numbers[i] + " " );
			sum += numbers[i];
			}
		}
		
		System.out.println( "\n 총합 : " + sum);
	}

}
