package ShipWar;

public class CreatMap {
	static int [][] map = new int [9][9];
	
	public static void CreateMap() {
		 
		for (int x = 0; x<10; x++) {
			for (int y = 0; y<10; y++) {
				map[x][y] = 0;
			}
		}
	}
	
	public static void  ShowMap() {
		
		for (int x = 0; x<10; x++) {
			for (int y = 0; y<10; y++) {
				System.out.print(map[x][y]);
			}
		}
	}

}
