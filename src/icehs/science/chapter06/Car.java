package icehs.science.chapter06;

public class Car {
	int oilAmount;
	double distance;
	
	void addoil( int oil ) {
		System.out.println(" 휘발유 " + oil + "주유합니다");
		oilAmount += oil;
	}
	
	void driveCar(String start, String end, double driveDistance ) {
		System.out.println( start + "에서 " + end + "까지" + driveDistance + "km 주행하였습니다");
		distance += driveDistance;
		oilAmount -= driveDistance / 20 // +=, -= 는 자료형 유지
	}
	
	void printCarInfo() {
		System.out.println(name + "남은 기름양" + oilAmount + "L, 총 주행거리" + distance);
	}
	
	double calculateEnableDistance() {
		return oilAmount * 20;
	}
}
