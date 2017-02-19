package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task24 {
	
    public static void main(String[] args) throws Exception {
    	
    /*ƒавайте напишем программу, в которой пользователь вводит три числа с клавиатуры. 
    * «атем происходит сравнение, и если мы находим число, которое отличаетс€ от двух других, 
    * выводим на экран его пор€дковый номер.	
    */
    	
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int a = Integer.parseInt(br.readLine());
	      int b = Integer.parseInt(br.readLine());
	      int c = Integer.parseInt(br.readLine());
	      
	      int k = (a + b) - c*2;
	      int m = a - b;
	      int n = a - c;
	      int r = b - c;
	      
	      
	      
		  if (k != 0 ) {
			  
			  System.out.println(a + " " + b + " " + c);      
		  }
		  
		  else if (n == 0) {
			  
			  System.out.println(a + " " + c); 
		  }
		  
          else if (r == 0) {
			  
			  System.out.println(b + " " + c); 
          }
		  
          else if (m == 0 ) {
			  
        	  System.out.println(a + " " + b); 
          }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        //напишите тут ваш код
    }
}
