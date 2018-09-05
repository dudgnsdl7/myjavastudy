package iceh.science.chapter09;

public class Person {
	private String name;
	private String phoneNumber;
	
	public void eat() {
		System.out.println("밥을 먹어요");
	}
	
	class Studunt extends Person{
		private String depertment;
		
		public void study() {
			System.out.println("공부를 합시다");
		}
		
	class Teacher extends Person{
		private String subject;
		
		public void teach() {
			System.out.println("가르칩시다");
		}
	}
	}
}
