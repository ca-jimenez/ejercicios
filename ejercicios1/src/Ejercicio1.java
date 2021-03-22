import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");

        int n = scanner.nextInt();

        int evenN = 0;

        for (int i = 0; evenN < n; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                evenN++;
            }
        }

        scanner.close();
    }
}
