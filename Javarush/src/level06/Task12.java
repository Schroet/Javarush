package level06;

//������� ����� Calculator, � �������� ����� 5 ����������� �������:
//int plus(int a, int b) � ���������� ����� ����� a � b
//int minus(int a, int b) � ���������� ������� ����� a � b
//int multiply(int a, int b) � ���������� ��������� ��������� ����� a �� ����� b
//double division(int a, int b) � ���������� ��������� ������� ����� a �� ����� b
//double percent(int a, int b) � ���������� ������� b �� ����� a

public class Task12 {
	
	public static int plus(int a, int b) {
        
        return a + b;
    }

    public static int minus(int a, int b) {
    	
        return a - b;
    }

    public static int multiply(int a, int b) {
    	
        return a * b;
    }

    public static double division(int a, int b) {
    	
        return (double) a / b;
    }

    public static double percent(int a, int b) {
    	
    	return (double)a * b / 100;
    }

    public static void main(String[] args) {
    	
    	System.out.println(plus(5,2));
    	System.out.println(minus(5,2));
    	System.out.println(multiply(5,2));
    	System.out.println(division(5,2));
    	System.out.println(percent(5,2));
    	
    	
    }
}