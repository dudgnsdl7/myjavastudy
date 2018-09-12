package iceh.science.chapter09;

public class Doctor {
	private String name;
	private String depertment;
	
	public Doctor(String name, String depertment) {
		super();
		this.name = name;
		this.depertment = depertment;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepertment() {
		return depertment;
	}
	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}
	
	public void treatPatient() {
		System.out.println("환자를 진료합니다");
	}
}
