  
/* Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

public class Main {
    public static void main(String[] args) {
       // Ваш код
    }
}


package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        float num1 = 9;
        float num2 = 5;
        float num3= 32;
        System.out.print("Enter value Celcium: ");
        a = scan.nextInt();
        System.out.println("Значеник температуры по °F: "+((num1/num2) * a + num3));
    }
}
