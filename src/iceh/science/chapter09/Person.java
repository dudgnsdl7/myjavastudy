package iceh.science.chapter09;

public class Person {
	private String name;
	private String phoneNumber;
	
	public void eat() {
		System.out.println("���� �Ծ��");
	}
	
	class Studunt extends Person{
		private String depertment;
		
		public void study() {
			System.out.println("���θ� �սô�");
		}
		
	class Teacher extends Person{
		private String subject;
		
		public void teach() {
			System.out.println("����Ĩ�ô�");
		}
	}
	}
}
