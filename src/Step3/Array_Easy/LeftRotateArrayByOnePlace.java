package Step3.Array_Easy;

import utilities.IOUtils;

public class LeftRotateArrayByOnePlace {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		IOUtils.printArray(rotateArray(arr, arr.length));
	}
	
	static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[(i + 1) % arr.length];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
