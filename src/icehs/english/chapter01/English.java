package icehs.english.chapter01;

public class English {
	String chapter;
	String nation;
	int score;
	public English(String chapter, String nation, int score) {
		this.chapter = chapter;
		this.nation = nation;
		this.score = score;
	}
	
	public void printEnglishInfo() {
		System.out.println("����:" + this.chapter);
		System.out.println("��汹��: " +this.nation);
		System.out.println("�⺻����: " +this.score);
	}
}
