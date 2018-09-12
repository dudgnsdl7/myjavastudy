package iceh.science.chapter09;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", "1234-5678");
		p1.eat();
		
		Student s1 = new Student("이순신","1234-5678","전사공학자");
		s1.eat();
		s1.study();
		
		Teacher t1 = new Teacher("강감찬","5555-6666","Java");
		t1.eat();
		t1.teach();
	}

}
