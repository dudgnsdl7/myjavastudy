package icehs.science.chapter06;

public class Student {
	
	String name;
	String id;
	int korean;
	int eng;
	int math;
	
	int calculateAverage() {
		int average = (korean  + eng + math) / 3;
		return average;
	}
	
	void printStudentInfo() {
		System.out.println("�л��� : " + name);
		System.out.println("�л� ID : " + id);
		System.out.println("�������� : " + korean);
		System.out.println("�������� : " + eng );
		System.out.println("�������� : " + math);
	}
	
	void changeStudentID(String newId) {
		id = newId;
	}
}
