package level07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task10 {
	
//	1. ������ ������ ����� � ������ main.
//	2. ������ � ���� 10 ������� � ����������, �� ������ ��������� �� � ����� ������, � � ������.
//	3. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
	
	  public static void main(String[] args) throws Exception {
		  
		ArrayList<String> strings = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			strings.add(0, reader.readLine());
		}

		for (int i = 0; i < strings.size(); i++) {

			System.out.println(strings.get(i));
		}

	}
}
