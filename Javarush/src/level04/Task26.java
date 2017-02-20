package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task26 {
	
	/*Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.*/
	
    public static void main(String[] args) throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int a = Integer.parseInt(br.readLine());
	    
	    if (a > 0 && a%2==0) {
	    	
	    System.out.println("положительное четное число");
	    
	    }
	    
	    else if (a > 0 && a%2==1) {
	    	
		    System.out.println("положительное нечетное число");
		    
		    }
        else if (a < 0 && (a*(-1))%2==0) {
	    	
		    System.out.println("отрицательное четное число");
		    
		    }
        else if (a < 0 && (a*(-1))%2==1) {
	    	
		    System.out.println("отрицательное нечетное число");
		    
		    }
	    
        else if (a == 0) {
	    	
		    System.out.println("ноль");
		    
		    }
    	
        //напишите тут ваш код
    }
}
