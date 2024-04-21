package Step1.LearningTheBasics.SortingI;

import utilities.IOUtils;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		selectionSort(arr);
		IOUtils.printArray(arr);
	}
	
	public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minimum_index = i;
            for(int j = i; j < n; j++){
                if(arr[j] < arr[minimum_index]){
                    minimum_index = j;
                }
            }

            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
    }

}
