package Step1.LearningTheBasics.BasicRecursion;

import utilities.IOUtils;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		int[] series = generateFibonacciNumbers(n);
		IOUtils.printArray(series);
	}
	
	public static int[] generateFibonacciNumbers(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        if(arr.length >= 2)
            arr[1] = 1;
        generateFibonacciNumbers(2, arr.length - 1, arr);
        return arr;
    }

    private static void generateFibonacciNumbers(int index, int lastIndex, int[] arr){

        if(index > lastIndex){
            return;
        }

        arr[index] = arr[index - 1] + arr[index - 2];

        generateFibonacciNumbers(index + 1, lastIndex, arr);
    }

}
