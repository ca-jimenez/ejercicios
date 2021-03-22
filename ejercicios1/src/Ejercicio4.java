import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese n");

        int n = scanner.nextInt();

        int primos = 0;

        for (int i = 2; primos < n; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                primos++;
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
