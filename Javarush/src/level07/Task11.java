package level07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task11 {
	
//	1. ������ ������ �����.
//	2. ������ � ���� 5 ����� � ����������.
//	3. ����� ��������� ������ � ������ � � ������. ��������� 13 ���.
//	4. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
	
    public static void main(String[] args) throws Exception {
    	
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i += 1) {
			list.add(reader.readLine());
		}
		for (int i = 0; i < 13; i += 1) {
			list.add(0, list.get(4));
			list.remove(5);
		}
		for (int i = 0; i < 5; i += 1) {
			System.out.println(list.get(i));
		}
	}
}