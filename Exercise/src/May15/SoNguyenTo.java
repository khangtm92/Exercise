package May15;

import java.util.ArrayList;

public class SoNguyenTo {
	public static void main(String[] args) {
		ArrayList<Integer> count = new ArrayList<Integer>();
		for(int i = 2; i<=100; i++) {
			boolean flag = true;
			for (int j = 2; j<i; j++) {
				if((i%j)==0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				count.add(i);
			}
		}
		
		System.out.println(count);
	}
}
