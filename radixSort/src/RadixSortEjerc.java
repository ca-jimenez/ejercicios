import java.util.ArrayList;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		String[] stringArr = StringUtil.toStringArray(arr);
		StringUtil.lNormalize(stringArr, '0');

		int stringMaxLength = StringUtil.maxLength(stringArr);

		for (int a = 0; a < stringMaxLength; a++) {

			ArrayList<String>[] lists = new ArrayList[arr.length];

			for (int z = 0; z < arr.length; z++) {
				lists[z] = new ArrayList<>();
			}

			for (int i = 0; i < arr.length; i++) {

				int digit = Integer.parseInt(String.valueOf(stringArr[i].charAt(stringArr[i].length() - a - 1)));

				lists[digit].add(stringArr[i]);
			}

			ArrayList<String> stringList = new ArrayList<>();

			for (ArrayList<String> x : lists) {
				stringList.addAll(x);
			}

			String[] sortedArray = stringList.toArray(new String[0]);

			System.arraycopy(sortedArray, 0, stringArr, 0, arr.length);
		}

		int[] intArr = StringUtil.toIntArray(stringArr);
		System.arraycopy(intArr, 0, arr, 0, arr.length);
	}

	public static void main(String[] args)
	{
		int[] arr ={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
