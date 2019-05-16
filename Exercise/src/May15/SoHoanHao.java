package May15;

import java.util.ArrayList;

public class SoHoanHao {
	public static void main(String[] args) {
		ArrayList<Integer> count = new ArrayList<Integer>();
		for (int i = 2; i <= 1000; i++) {
			int sum = 1;
			for (int j = 2; j <= (i/2); j++) {
				if ((i % j) == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				count.add(i);
			}
		}

		System.out.println(count);
	}
}
