/*
Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.
Подсказка:
будет три миллиона с хвостиком.
Требования:
•	Программа должна выводить целое число на экран.
•	Метод main должен вызывать функцию System.out.println.
•	Выведенное число должно быть больше трех миллионов.
•	Выведенное число должно соответствовать заданию.
*/

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       // int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
         //   sum = sum + arr[i]; сумма чисел
            product = product * arr[i];
        }
      //  System.out.println(sum); выводит на экран сумму данных чисел
        System.out.println(product);
    }
}