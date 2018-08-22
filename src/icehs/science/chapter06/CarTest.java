package icehs.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		
		cr.oilAmount = 5;
		cr.distance = 140.0;
		
		cr.printCarInfo();
		
		cr.addoil(10);
		
		cr.printCarInfo();
		
		cr.driveCar("IT센터", "인천공항", 10.17);
		cr.printCarInfo();
		
		cr.driveCar("곤지암리조트", "인천공항", 60.21);
		cr.printCarInfo();
		
		cr.calculateEnableDistance();
	}

}
