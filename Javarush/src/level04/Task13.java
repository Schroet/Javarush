package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task13 {
	
	 public static void main(String[] args) throws Exception {
	        
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	int a = Integer.parseInt(br.readLine());
	    	
	    	if (a > 7 || a < 1) {
	    		System.out.println("такого дня недели не существует");
	    	}
	    	
	    	
	    	switch (a) 
	    	{ 
	    	case 1: 
	    	
	    		      System.out.println("понедельник");   
	    	             break; 
	    	case 2: 
	    	
	    		      System.out.println("вторник");
	    	              break; 
	    	case 3: 
	    	
	    		      System.out.println("среда");
	    	              break; 
	    	case 4: 
	    	
	    		      System.out.println("четверг"); 
	    	              break; 
	    	case 5: 
		    	
  		              System.out.println("пятница"); 
  	              break; 
  	              
	    	case 6: 
		    	
  		              System.out.println("суббота"); 
  	              break; 
  	              
	    	case 7: 
		    	
  		      System.out.println("воскресенье"); 
  	              break;       
         
	    	}

	 }
}
