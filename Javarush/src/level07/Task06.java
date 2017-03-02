package level07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task06 {
	
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] big = new int[15];

		for (int i = 0; i < big.length; i++) {
			String s = reader.readLine();
			big[i] = Integer.parseInt(s);
		}

		int left = 0;
		int right = 0;

		for (int i = 0; i < big.length; i++) {
			if (i % 2 == 0) {
				left += big[i];
			} else {
				right += big[i];
			}
		}

		if (left > right) {
			System.out.println("В домах с четными номерами проживает больше жителей.");
		} else
			System.out.println("В домах с нечетными номерами проживает больше жителей.");

	}
}

