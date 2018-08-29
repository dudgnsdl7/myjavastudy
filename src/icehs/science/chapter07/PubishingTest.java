package icehs.science.chapter07;

public class PubishingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication p1 = new Publication();
		System.out.println("=====출판물 정보를 세팅합니다");
		p1.setTitle("만화삼국지");
		p1.setPrice(5000);
		p1.setPage(300);
		
		
		System.out.println(p1.getPage() + p1.getPrice() + p1.getTitle());
		
		
	}

}
