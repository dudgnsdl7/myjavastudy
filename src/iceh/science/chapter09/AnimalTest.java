package iceh.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat(3,"�߿���","�丣�þ�");
/*		c1.setName("�߿���");
		c1.setAge(3);
		c1.setKind("�丣�þ�");*/
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getKind());
		
		c1.run();
		c1.hunt();
		c1.play();
		
		Dog dog = new Dog(2,"�ú����� �㽺Ű", "�۸���");
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.getKind());
		
		dog.run();
		dog.hunt();
	
		System.out.println(dog);
	}

}
