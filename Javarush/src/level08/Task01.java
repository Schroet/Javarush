package level08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Task01 {
	
//	������� ��������� HashSet � ����� ��������� String.
//	�������� � �� 10 �����: �����, �����, �����, �����, ����, �������, ����-����, ���������, ����, ���������.
//	������� ���������� ��������� �� �����, ������ ������� � ����� ������.
//	����������, ��� ��������� ������� ����������� ���������.
	
	
	
	   public static void main(String[] args) throws Exception {
	       
		HashSet<String> set = new HashSet<String>();
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("����");
		set.add("�������");
		set.add("����-����");
		set.add("���������");
		set.add("����");
		set.add("���������");

		  for (String text : set)   
		    {
		        System.out.println(text);
		    }
		}
}