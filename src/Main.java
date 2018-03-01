import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map map;
        try {
            Scanner scanner = new Scanner(new FileReader("a_example.in"));
            String config = scanner.nextLine();
//            map = config
            while (scanner.hasNextLine()) {
                String content = scanner.nextLine();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
