import java.util.Scanner;

public class SquaredNumber {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int squared = n * n;
            System.out.println(squared);
        }

        scanner.close();
    }

}
