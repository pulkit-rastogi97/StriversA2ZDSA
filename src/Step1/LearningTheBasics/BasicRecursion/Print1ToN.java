package Step1.LearningTheBasics.BasicRecursion;

import utilities.IOUtils;

public class Print1ToN {

	public static void main(String[] args) {
		int x = IOUtils.takeIntInput();
		int[] arr = printNos(x);
		IOUtils.printArray(arr);
	}
	
	public static int[] printNos(int x) {
        int[] arr = new int[x];

        fillArray(arr, x);
        return arr;
    }

    private static void fillArray(int[] arr, int x){
        // arr[x] = x + 1;

        if(x > 0){
            fillArray(arr, x - 1);
            arr[x - 1] = x;
        }
        
        // return;
    }

}
