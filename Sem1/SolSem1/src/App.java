import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        task1();

        // System.out.println(LocalDateTime.now());

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
