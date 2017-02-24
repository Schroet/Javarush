/**
 * 
 */
package level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

////Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
////Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
////Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
////Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
////Вывести на экран сообщение: «Even: а Odd: b», где а — количество четных цифр, b — количество нечетных цифр.
//
//Пример для числа 4445:
//Even: 3 Odd: 1

public class Task06 {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
    	
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
	     for(int x = Integer.parseInt(br.readLine()); x > 0 ; x = x / 10){
	    	 if ((x % 2) == 0) even++;
	    	 else odd++; }
	     
	     System.out.println("Even: " + even + " Odd: " + odd);
    	
       
    }
}
