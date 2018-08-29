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
		System.out.println("제목:" + this.chapter);
		System.out.println("배경국가: " +this.nation);
		System.out.println("기본점수: " +this.score);
	}
}
