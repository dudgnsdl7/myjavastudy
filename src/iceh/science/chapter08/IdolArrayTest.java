package iceh.science.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Idol[] idols = new Idol[4];
		Idol[] idols = {
				new Idol("¼Ò³à½Ã´ë", "ÅÂÇö"), new Idol("½Ã½ºÅ¸", "º¸¶ó"), new Idol("ºò¹ð", "Áöµå·¡°ï"), new Idol("ºñ½ºÆ®", "¾çÈ¿¼·")
		};
		idols[0].printIdolInfo();
		idols[1].printIdolInfo();
		idols[2].printIdolInfo();
		idols[3].printIdolInfo();
	}

}
