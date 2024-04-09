import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a any one character:");
        char triangleChar = scanner.next().charAt(0);

        System.out.println("Enter  right triangle height:");
        int triangleHeight = scanner.nextInt();

        for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(triangleChar + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
