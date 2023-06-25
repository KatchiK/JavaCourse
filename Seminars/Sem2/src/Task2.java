public class Task2 {

    /*
     * Задание №2
     * Напишите метод, который сжимает строку.
     * Пример: вход aaaabbbcdd.
     */

    public static String compressString(String input) {
        StringBuilder sb = new StringBuilder();
        char sbl = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar == sbl) {
                count++;
            } else {
                sb.append(sbl);
                sb.append(count);
                sbl = nextChar;
                count = 1;
            }

        }
        sb.append(sbl);
        sb.append(count);
        return sb.toString();

    }
}
