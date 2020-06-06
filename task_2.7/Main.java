/*
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
*/


public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5,4,6));
    }

    public static int sumDigitsInNumber(int a, int b, int c) {
        return a+b+c;
    }
}
