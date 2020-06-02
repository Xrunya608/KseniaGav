/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        float num1 = 1000;
        System.out.println("Enter values in metres");
        System.out.print("First value: ");
        a = scanner.nextInt();
        System.out.print("Second value: ");
        b = scanner.nextInt();
        System.out.print("Third value: ");
        c = scanner.nextInt();
        System.out.println("Your result: "+ (a * b * c)*num1 + " liters");
    }

}

/*Enter values in metres
First value: 25
Second value: 5
Third value: 2
Your result: 250000.0 liters

Process finished with exit code 0
*/
