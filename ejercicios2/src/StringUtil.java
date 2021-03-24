import java.util.Locale;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String concatenated = "";

        for (int i = 0; i < n; i++) {
            concatenated += c;
        }
        return concatenated;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        int multiplier = n - s.length();
        String padding = replicate(c, multiplier);

        return padding + s;
    }

    public static String rpad(String s, int n, char c) {
        int multiplier = n - s.length();
        String padding = replicate(c, multiplier);

        return s + padding;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        int length = arr.length;

        String arrCopy[] = new String[length];

        for (int i = 0; i < length; i++) {
            arrCopy[i] = String.valueOf(arr[i]);

        }
        return arrCopy;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int length = arr.length;

        int[] arrCopy = new int[length];

        for (int i = 0; i < length; i++) {
            arrCopy[i] = Integer.parseInt(arr[i]);

        }
        return arrCopy;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int maxLength = 0;

        for (String x : arr) {

            if (x.length() > maxLength) {
                maxLength = x.length();
            }
        }

        return maxLength;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int length = maxLength(arr);

        for (int i = 0; i < arr.length; i++) {

            arr[i] = lpad(arr[i], length, c);
        }
    }

    public static String ltrim(String s) {

        String sCopy = s;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {

                sCopy = s.substring(i);
                break;
            }
        }
        return sCopy;
    }

    public static String rtrim(String s) {

        String sCopy = s;
        boolean textFound = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && !textFound) {

                textFound = true;
            }

            if (textFound && s.charAt(i) == ' ') {

                sCopy = s.substring(0, i);
                break;
            }
        }
        return sCopy;
    }

    public static String trim(String s) {

        boolean textFound = false;
        int textStart = 0;
        int textEnd = s.length();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && !textFound) {

                textStart = i;
                textFound = true;
            }

            if (textFound && s.charAt(i) == ' ') {

                textEnd = i;
                break;
            }
        }

        return s.substring(textStart, textEnd);
    }

    public static int indexOfN(String s, char c, int n) {

        int counter = 0;
        int index = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.toLowerCase().charAt(i) == c) {
                counter++;
            }

            if (counter == n) {
                index = i;
                break;
            }
        }

        return index;
    }
}
