package iceh.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat(3,"야옹이","페르시안");
/*		c1.setName("야옹이");
		c1.setAge(3);
		c1.setKind("페르시안");*/
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getKind());
		
		c1.run();
		c1.hunt();
		c1.play();
		
		Dog dog = new Dog(2,"시베리안 허스키", "멍멍이");
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.getKind());
		
		dog.run();
		dog.hunt();
	
		System.out.println(dog);
	}

}
