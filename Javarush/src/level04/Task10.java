package level04;

public class Task10 {
	
	   public static void main(String[] args) {
	        checkInterval(60);
	        checkInterval(112);
	    }

	    public static void checkInterval(int a) {
	        
	        if (a < 50) {
	            
	            System.out.println("Число " + a + " не содержится в интервале.");
	        }
	        
	        else if ( a > 100 ) {
	        	
	        	System.out.println("Число " + a + " не содержится в интервале.");
	        }
	        
            else if ( a >= 50 && a <=100 ) {
	        	
	        	System.out.println("Число " + a + " содержится в интервале.");
	        }
	        
	        //::CODE:
	    }
	}