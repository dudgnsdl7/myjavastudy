package icehs.science.chapter06;

public class Car {
	int oilAmount;
	double distance;
	
	void addoil( int oil ) {
		System.out.println(" �ֹ��� " + oil + "�����մϴ�");
		oilAmount += oil;
	}
	
	void driveCar(String start, String end, double driveDistance ) {
		System.out.println( start + "���� " + end + "����" + driveDistance + "km �����Ͽ����ϴ�");
		distance += driveDistance;
		oilAmount -= driveDistance / 20 // +=, -= �� �ڷ��� ����
	}
	
	void printCarInfo() {
		System.out.println(name + "���� �⸧��" + oilAmount + "L, �� ����Ÿ�" + distance);
	}
	
	double calculateEnableDistance() {
		return oilAmount * 20;
	}
}
