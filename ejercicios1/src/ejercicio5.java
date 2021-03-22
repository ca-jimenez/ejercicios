import java.util.Scanner;

public class ejercicio5 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese n");

        int n = scanner.nextInt();

        System.out.println("Ingrese m");

        int m = scanner.nextInt();

        System.out.println("Ingrese d");

        int d = scanner.nextInt();

        int numbers = 0;

        for (int i = 0; numbers < n; i++) {

            int repeatedDigit = 0;

            int number = i;

            while (number > 0) {

                int digit = number % 10;

                if (digit == d) {
                    repeatedDigit++;
                }
                number = number / 10;
            }

            if (repeatedDigit >= m) {
                System.out.println(i);
                numbers++;
            }
        }
        scanner.close();
    }
}
