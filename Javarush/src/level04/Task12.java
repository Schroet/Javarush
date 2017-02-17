package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task12 {
	
	 /*Ввести с клавиатуры число.
	Если число положительное, то увеличить его в два раза.
	Если число отрицательное, то прибавить единицу.
	Если введенное число равно нулю, необходимо вывести ноль.
	Вывести результат на экран. */
	
    public static void main(String[] args) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int a = Integer.parseInt(br.readLine());
    	
    	if (a > 0) {
    		
    		int b = a*2;
    		System.out.println(b);
    	}
    	
    	else if (a < 0) {
    		
    		int b = a+1;
    		System.out.println(b);
    	}
    	
       else {

    		System.out.println(a);
    	}

    }

}