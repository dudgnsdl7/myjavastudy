package icehs.science.chapter06;

public class Mambertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		m1.name ="홍길동";
		m1.password= "1234";
		m1.mileage = 5000 ;
		m1.makeReserve();
		if(m1.enterEvent()) {
			System.out.println("이밴트 참여 성공");
		}
		
		else {
			System.out.println("이밴트 참여 실패");
		}
	}

}
