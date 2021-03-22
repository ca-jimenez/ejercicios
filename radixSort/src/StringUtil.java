public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
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
	public static String lpad(String s, int n, char c)
	{
		int multiplier = n - s.length();
		String padding = replicate(c, multiplier);

		return padding + s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		int length = arr.length;

		String arrCopy[] = new String[length];

		for(int i = 0; i < length; i++)
		{
			arrCopy[i] = String.valueOf(arr[i]);

		}
		return arrCopy;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int length = arr.length;

		int[] arrCopy = new int[length];

		for(int i = 0; i < length; i++)
		{
			arrCopy[i] = Integer.parseInt(arr[i]);

		}
		return arrCopy;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLength = 0;

		for (String x: arr) {

			if (x.length() > maxLength) {
				maxLength = x.length();
			}
		}

		return maxLength;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int length = maxLength(arr);

		for(int i=0; i<arr.length;i++) {

			arr[i] = lpad(arr[i], length, c);
		}
	}
}
