package iceh.science.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
			
			if (minNum > arr[i]) {
				minNum = arr[i];
			}
		}
		System.out.println("최대값 : " + maxNum);
		System.out.println("최솟값 : " + minNum);
	}

}
