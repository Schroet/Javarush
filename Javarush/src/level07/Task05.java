package level07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1. —оздать массив на 20 чисел.
/*
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
*/
//2. ¬вести в него значени€ с клавиатуры.
//3. —оздать два массива на 10 чисел каждый.
//4. —копировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину 
//     во второй маленький.
//5. ¬ывести второй маленький массив на экран, каждое значение выводить с новой строки.


public class Task05 {
	
    public static void main(String[] args) throws Exception {
    	
    	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	    int[] big = new int[20];

    	    for (int i = 0; i < big.length; i++)
    	    {
    	      String s = reader.readLine();
    	      big[i] = Integer.parseInt(s);
    	    }
    	    
    	    int[] small = new int[10];
    	    System.arraycopy(big, 0, small, 0, 9);
    	   
    	    int[] small2 = new int[10];
    	    System.arraycopy(big, 10, small2, 0, 10);
    	    for (int j = 0; j < small2.length; j++)  
        	 System.out.println(small2[j]);

    }
}
