package level05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task07 {
	
//	Вводить с клавиатуры числа и вычислить среднее арифметическое.
//	Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
//	-1 не должно учитываться.
//
//	Пример для чисел 1 2 2 4 5 -1:
//	2.8
//
//	Пример для чисел 4 3 2 1 -1:
//	2.5

	public static void main(String[] args) throws Exception {
		//напишите тут ваш код
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int count = 0;
		while (true){
		int a = Integer.parseInt(reader.readLine());
		if (a != -1) {
		sum += a;
		count++;
		}
		else {
		System.out.println((double) sum / count);
		break;
		}
		}
		}
		}
        //напишите тут ваш код
    

