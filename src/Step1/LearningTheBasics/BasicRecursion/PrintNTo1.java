package Step1.LearningTheBasics.BasicRecursion;

import utilities.IOUtils;

public class PrintNTo1 {
	public static void main(String[] args) {
		int x = IOUtils.takeIntInput();
		int[] arr = printNos(x);
		IOUtils.printArray(arr);
	}
	
	public static int[] printNos(int x) {
        int[] arr = new int[x];
        int start = 0;
        fillArray(arr, x, start);
        return arr;
    }

    private static void fillArray(int[] arr, int x, int start){

        if(x > 0){
            arr[start] = x;
            fillArray(arr, x - 1, start + 1);
        }
    }
}
