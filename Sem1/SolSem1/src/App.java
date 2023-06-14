import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // task1();
        // task2();
        // task3();
        task4();
    }


    private static void task4() {
        // Напишите метод, который находит самую длинную строку общего префикса среди
        // массива строк.
        // Если общего префикса нет, вернуть пустую строку "".
        String[] lines = { "domino", "dom", "domovoy", "domashniy" };
        System.out.println(findPfx(lines));
        System.out.println(lines[0].substring(0, findPfx(lines)));

    }

    private static int findPfx(String[] lines) {
        int res = 0;
        boolean pfxExist = true;
        while (pfxExist) {
            res++;
            for (int i = 0; i < (lines.length - 1); i++) {
                if (res <= lines[i].length() && res <= lines[i + 1].length()) {
                    if (lines[i].substring(0, res).compareTo(lines[i + 1].substring(0, res)) != 0) {
                        res--;
                        pfxExist = false;
                        break;
                    }
                } else {
                    res--;
                        pfxExist = false;
                        break;
                }
            }
        }
        return res;
    }
    /* 
    private static int task4() {
        // 1) берём 1 букву в первом слове - обходим все слова
        // 2) Если буква есть во всех словах, то ++ в накопитель
        // 3) Пункт 1
        // 4) Если нет, то выход из программы

        String[] arrayWords = { "domino", "dom", "domovoy", "domashniy" };
        boolean prefixExit = true;
        int res = 0;
        String letter = null;
        int numberLetter = 0;
        int stringLength = arrayWords[0].length();
        int i = 0;

        while (prefixExit && i < stringLength) {
            // for (int i = 0; i < stringLength; i++) {

            letter = arrayWords[0].substring(numberLetter, numberLetter + 1);
            System.out.println(letter)  ;
            for (int j = 1; j < arrayWords.length; j++) {
                    boolean b = letter == arrayWords[j].substring(numberLetter, numberLetter + 1);

                if (stringLength < arrayWords[j].length() && j < stringLength
                        && arrayWords[j].substring(numberLetter, numberLetter + 1).compareTo(letter) !=0) {
                    res++;


                } else {
                    res = 0;
                    prefixExit = false;
                    break;
                }
            }
            numberLetter++;
            i++;
        }

        System.out.println(res);
        return res;

    }
    */

    private static void task3() {
        int[] arr = { 1, 1, 1, 3, 1, 3, 3, 1, 1, 0, 3, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1 };
        int val = 3;
        int[] resArr = new int[arr.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                resArr[index++] = arr[i];
            } else {
                count++;
            }
            for (int j = resArr.length - count; j < resArr.length; j++) {
                resArr[j] = val;
            }
        }
        for (int item : resArr) {
            System.out.printf("%d\t", item);
        }

    }

    private static void task2() {
        int[] arr = { 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
            } else {
                if (countMax < count) {
                    countMax = count;

                }
                count = 0;
            }
        }
        if (countMax < count) {
            countMax = count;
        }
        System.out.printf("Наибольшее количество единиц - %s", countMax);

    }

    private static void task1() {
        System.out.println("Hello, World!");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
        Depends(name);
    }

    private static void Depends(String name) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        if (lt.getHour() >= 18 && lt.getHour() < 23) {
            System.out.printf("Good evening, %s\n", name);
        } else if (lt.getHour() >= 23 && lt.getHour() < 5) {
            System.out.printf("Good night, %s!\n", name);
        } else if (lt.getHour() >= 5 && lt.getHour() < 12) {
            System.out.printf("Good morning, %s!\n", name);
        } else if (lt.getHour() >= 12 && lt.getHour() < 18) {
            System.out.printf("Good afternoon, %s!\n", name);
        }
    }

}
