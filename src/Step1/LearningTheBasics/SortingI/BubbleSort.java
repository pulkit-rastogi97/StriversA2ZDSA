package Step1.LearningTheBasics.SortingI;

import utilities.IOUtils;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		bubbleSort(arr, arr.length);
		IOUtils.printArray(arr);
	}

	public static void bubbleSort(int[] arr, int n) {
		for (int i = n - 1; i >= 0; i--) {
			int didSwaps = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					didSwaps = 1;
				}
			}

			if (didSwaps == 0) {
				break;
			}
		}
	}
}
