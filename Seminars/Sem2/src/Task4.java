import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task4 {
    public static void writeTestToFile(int n) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("output.txt"))) {
            pw.println(generateString("TEST", n));

        }
    }

    private static String generateString(String s, int repeatCount) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < repeatCount; i++) {
            sb.append(s);
        }

        return sb.toString();
    }

}
