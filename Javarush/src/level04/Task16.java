package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task16 {
	
	/*������ ��������� ��� ��������� ����������������� ��������� �������:
� ������ ������� ���� � ������� ���� ����� ����� ������ ������,
����� � ������� ����� ������ � ������,
� ����� � ������� ����� ������ � �������,
����� ����� ������ ����� ��� ������ � �. �.
������ � ���������� ������������ ����� t, ���������� ����� � �������, ��������� � ������ ���������� ����.
����������, ������ ������ ����� ����� ��� ��������� � ���� ������.
��������� ������� �� ����� � ��������� ����:
������� � ���� ����� ������ ����,
������� � ���� ����� ������ ����,
�������� � ���� ����� ������� ����. */

    
    public static void main(String[] args) throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	double a = Double.parseDouble(br.readLine());
    	
    	
    	double m = a%5; 
    	
    	if (m >= 0 && m <= 3) {
    		
    		System.out.println("������");
    	}
    	
    	else if (m > 3 && m <= 4) {
    		
    		System.out.println("������");
    	}
    	
else if (m > 4 && m <= 5) {
    		
    		System.out.println("�������");
    	}

       
    }
}
