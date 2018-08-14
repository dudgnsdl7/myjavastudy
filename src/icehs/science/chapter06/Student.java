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
		System.out.println("학생명 : " + name);
		System.out.println("학생 ID : " + id);
		System.out.println("국어점수 : " + korean);
		System.out.println("영어점수 : " + eng );
		System.out.println("수학점수 : " + math);
	}
	
	void changeStudentID(String newId) {
		id = newId;
	}
}
