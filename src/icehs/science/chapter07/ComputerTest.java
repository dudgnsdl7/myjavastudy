package icehs.science.chapter07;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer("R500", "win 7", 100);
		c1.printComputerInfo();
		
		Computer c2 = new Computer("R570", "win 10", 200, 30);
		c2.printComputerInfo();
	}

}
