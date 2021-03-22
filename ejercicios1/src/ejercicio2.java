import java.util.Scanner;

public class ejercicio2 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese n");

        int n = scanner.nextInt();

        System.out.println("Ingrese m");

        int m = scanner.nextInt();


        for (int i = 0; i < n; i++) {

            System.out.println((i+1) * m);

        }

        scanner.close();
    }
}
