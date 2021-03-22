import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese n");

        int n = scanner.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (n < 2) {
            esPrimo = false;
        }

        if (esPrimo) {
            System.out.println(n + " es primo");

        } else {
            System.out.println(n + " no es primo");
        }

        scanner.close();
    }
}
