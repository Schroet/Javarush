package level07;

import java.util.ArrayList;

public class Task07 {

	public static void main(String[] args) throws Exception {

		ArrayList<String> list = new ArrayList<String>();
		list.add("s3");
		list.add("qa1");
		list.add("qa2");
		list.add("qa3");
		list.add("qa4");

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

	}

}
