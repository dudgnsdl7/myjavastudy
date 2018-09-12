package iceh.science.chapter09;

public class Dentist extends Doctor {
	public Dentist (String name, String depertment) {
		super (name, depertment);
	}
	
	
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다");
	}
}
