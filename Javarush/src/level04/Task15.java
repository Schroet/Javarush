package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task15 {
	  public static void main(String[] args) throws Exception {
		  
		 /* Правило треугольника
		  Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
		  Определить возможность существования треугольника по сторонам.
		  Результат вывести на экран в следующем виде:
		  «Треугольник существует.» — если треугольник с такими сторонами существует.
		  «Треугольник не существует.» — если треугольник с такими сторонами не существует.

		  Подсказка:
		  Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
		  Требуется сравнить каждую сторону с суммой двух других.
		  Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует. */
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int a = Integer.parseInt(br.readLine());
	      int b = Integer.parseInt(br.readLine());
	      int c = Integer.parseInt(br.readLine());
	       
	      if (a + b > c && a + c > b && b + c > a) {
	    	  
	    	System.out.println("Треугольник существует.");  
	      }
	      
	      else {
	    	  
	    	  System.out.println("Треугольник не существует."); 
	      }
		  
		  
		  
		  
		  
		  
		  
		  
	        //напишите тут ваш код
	    }
	}