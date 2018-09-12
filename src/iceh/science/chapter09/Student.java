package iceh.science.chapter09;

	public class Student extends Person{
		private String depertment;
		
		
		public Student(String name, String phoneNumber, String depertment) {
			super (name, phoneNumber);
			this.depertment = depertment;
		}
		
		public void eat() {
			super.eat();
			System.out.println("조별로 먹어요");
		}
		public void study() {
			System.out.println("공부를 합시다");
		}
	}