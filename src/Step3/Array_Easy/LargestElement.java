package Step3.Array_Easy;

import utilities.IOUtils;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		System.out.println(largestElement(arr, arr.length));
	}
	
    static int largestElement(int[] arr, int n) {
        int largestElement = arr[0];
        for(int x : arr){
            if(x > largestElement){
                largestElement = x;
            }
        }

        return largestElement;
    }
}
