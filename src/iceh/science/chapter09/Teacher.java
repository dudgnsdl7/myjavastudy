package iceh.science.chapter09;

   public class Teacher extends Person{
	private String subject;
	
	public Teacher(String name, String phoneNumber, String subject) {
		super(name, phoneNumber);
		this.subject = subject;
	}
	
	public void eat() {
		super.eat();
		System.out.println("다 같이 먹어요");
	}
	public void teach() {
		System.out.println("가르칩시다");
	}
}