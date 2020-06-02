/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        float num1 = 100;
        float num2 = 15;
        System.out.print("Enter your number: ");
        a = scanner.nextInt();
        System.out.println(a +" + 15% = "+((a/num1*num2)+a)+"%");
    }

}

Enter your number: 25
25 + 15% = 28.75%

Process finished with exit code 0
