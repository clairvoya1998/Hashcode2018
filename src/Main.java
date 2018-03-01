import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new FileReader("a_example.in"));
            String config = scanner.nextLine();

            while (scanner.hasNextLine()) {
                String content = scanner.nextLine();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
