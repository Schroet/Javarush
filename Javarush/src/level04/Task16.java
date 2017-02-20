package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task16 {
	
	/*–абота светофора дл€ пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелЄный сигнал,
затем в течение одной минуты Ч желтый,
а потом в течение одной минуты Ч красный,
затем оп€ть зелЄный горит три минуты и т. д.
¬вести с клавиатуры вещественное число t, означающее врем€ в минутах, прошедшее с начала очередного часа.
ќпределить, сигнал какого цвета горит дл€ пешеходов в этот момент.
–езультат вывести на экран в следующем виде:
ЂзелЄныйї Ч если горит зелЄный цвет,
Ђжелтыйї Ч если горит желтый цвет,
Ђкрасныйї Ч если горит красный цвет. */

    
    public static void main(String[] args) throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	double a = Double.parseDouble(br.readLine());
    	
    	
    	double m = a%5; 
    	
    	if (m >= 0 && m <= 3) {
    		
    		System.out.println("зелЄный");
    	}
    	
    	else if (m > 3 && m <= 4) {
    		
    		System.out.println("желтый");
    	}
    	
else if (m > 4 && m <= 5) {
    		
    		System.out.println("красный");
    	}

       
    }
}
