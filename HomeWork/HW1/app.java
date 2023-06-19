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
        //boolean end = false;
        int number = 2;
        int divider = 2;
        int primeNumber = 0;
        int countPrimeNumber = 0;

        while (number <= 1000) {
            divider = 2;
            primeNumber = 1;
            while (divider < number) {
                if (number % divider == 0) {
                    divider = number;
                    primeNumber = 0;
                } else {
                    primeNumber = number;
                    
                }
                divider = divider + 1;
            }
            if (primeNumber != 0) {
                System.out.println(number);
                countPrimeNumber ++;
            }
            number = number + 1;
        }
        System.out.printf("Количество простых чисел: %s", countPrimeNumber);
        }

    private static void task1() {
        System.out.printf("Enter number: ");

        Scanner in = new Scanner(System.in);

        int NumberN = in.nextInt();

        int amount = 0;

        for (int i = 1; i <= NumberN; i++) {
            amount = amount + i;
        }

        System.out.println(amount);
        in.close();
    }

}
