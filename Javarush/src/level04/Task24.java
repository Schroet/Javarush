package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task24 {
	
    public static void main(String[] args) throws Exception {
    	
    /*Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры. 
     * Затем происходит сравнение, и если мы находим число, которое отличается от двух других, 
     * выводим на экран его порядковый номер.
    */
    	
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int a = Integer.parseInt(br.readLine());
	      int b = Integer.parseInt(br.readLine());
	      int c = Integer.parseInt(br.readLine());

	      
		  if (a == b && c != b) {
			  
			  System.out.println(3); 
		  }
		  
          else if (a == c && b != c) {
			  
			  System.out.println(2); 
          }
		  
          else if (b == c && a != b) {
			  
        	  System.out.println(1); 
          }
		  
    /*    else if (a == b && a ==c && a == c ) {
			  
			  System.out.println("Числа равны");
		  }
		  
         else if (a != b && a !=c && a != c ) {
			  
			  System.out.println("Числа не равны"); 
		  }
*/

    }
}
