package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task28 {
	
//	Ввести с клавиатуры три целых числа. 
//	Вывести на экран количество положительных чисел в исходном наборе.
	
	
	
	
	   public static void main(String[] args) throws Exception {
		   
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      int a = Integer.parseInt(br.readLine());
		      int b = Integer.parseInt(br.readLine());
		      int c = Integer.parseInt(br.readLine());
		      
		     
		      
		      if (a > 0 && b < 0 && c < 0 || b > 0 && a < 0 && c < 0 || c > 0 && a < 0 && b < 0) {
		    	  
		    	  System.out.println(1);
		      }
		      
		      else if (a > 0 && b >0 && c < 0  || b > 0 && c > 0 && a < 0 ||a > 0 && c > 0 && b < 0) {
		    	  
		    	  System.out.println(2);
		      }
		      
              else if (a > 0 && b >0 && c > 0) {
		    	  
		    	  System.out.println(3);
		      }
		      
             else if (a < 0 && b < 0 && c < 0) {
		    	  
		    	  System.out.println(0);
		      }

	    }
	}

