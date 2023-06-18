package HomeWork.HW1;

import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {

        /*
         * 1) Вычислить сумма чисел от 1 до n
         * 2) Вывести все простые числа от 1 до 1000
         * 3) Реализовать простой калькулятор
         */
        // task1();
        task2();

    }

    private static void task2() {
        boolean end = false;
        int number = 1;
        int divider = 3;

        while (number <= 100) {
            boolean primeNumber = true;
            while (primeNumber == true) {

                if (divider < number) {
                    if (number % divider == 0) {
                        primeNumber = false;
                        System.out.println(primeNumber);
                    } 

                } else {
                    System.out.println(number);
                    primeNumber = false;

                }

                divider = divider + 1;

            }
            number = number + 1;

        }

    }

    private static void task1() {
        System.out.printf("Enter number: ");

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int NumberN = in.nextInt();

        int amount = 0;

        for (int i = 1; i <= NumberN; i++) {
            amount = amount + i;
        }

        System.out.println(amount);
        in.close();
    }

}
