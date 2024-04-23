package Step3.Array_Easy;

import utilities.IOUtils;

public class MoveZeroesToEnd {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		IOUtils.printArray(moveZeros(arr.length, arr));
	}
	
	public static int[] moveZeros(int n, int []arr) {

        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        for(int i = j; j < arr.length; j++){
            arr[j] = 0;
        }
        
        return arr;
    }
}
