package icehs.science.chapter06;

public class BuildingTest {
	public static void main (String[] args ) {
		Building building = new Building();
		
		building.name = "국새선타워";
		building.address = "김포동";
		building.totalFloor = 5;
		
		System.out.println( "건물명 :" + building.name);
		System.out.println("wnth :" + building.address);
		System.out.println("전체 층 수 :" + building.totalFloor);
		
		building.moveElevator();
		building.changeAddress("운서동");
		
		System.out.println("새 주소 :" +building.address);
	}
}
