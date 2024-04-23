package Step3.Array_Easy;

import utilities.IOUtils;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		int num = IOUtils.takeIntInput();

		System.out.println(linearSearch(arr.length, num, arr));

	}

	public static int linearSearch(int n, int num, int[] arr) {
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return index;
	}

}
