package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task09 {

	public static void main(String[] args) throws IOException {

		ArrayList<String> strings = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			strings.add(reader.readLine());
		}
		int max = strings.get(0).length();
		for (int i = 1; i < 5; i++) {
			if (strings.get(i).length() < max)
				max = strings.get(i).length();
		}
		for (int i = 0; i < 5; i++) {
			if (strings.get(i).length() == max)
				System.out.println(strings.get(i));
		}
	}
}