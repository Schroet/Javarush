package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task29 {
	
//	Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
//	в следующем виде:
//	«количество отрицательных чисел: а», «количество положительных чисел: б»,
//	где а, б — искомые значения.
//
//	Пример для чисел 2 5 6:
//	количество отрицательных чисел: 0
//	количество положительных чисел: 3
//
//	Пример для чисел -2 -5 6:
//	количество отрицательных чисел: 2
//	количество положительных чисел: 1
	
	
	   public static void main(String[] args) throws Exception {
	       
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      int a = Integer.parseInt(br.readLine());
		      int b = Integer.parseInt(br.readLine());
		      int c = Integer.parseInt(br.readLine());
		      

		      int result = 0;
		      int result2 = 0;

		      if (a > 0){
		      result++;
		      }
		      if (b > 0){
		      result++;
		      }
		      if (c > 0){
		      result++;
		      }
		      if (a < 0){
		      result2++;
		      }
		      if (b < 0){
		      result2++;
		      }
		      if (c < 0){
		      result2++;
		      }
		      System.out.println("количество отрицательных чисел: "+result2);
		      System.out.println("количество положительных чисел: "+result);

	    }
	}
