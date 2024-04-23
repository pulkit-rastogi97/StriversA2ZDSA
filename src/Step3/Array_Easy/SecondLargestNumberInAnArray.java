package Step3.Array_Easy;

import utilities.IOUtils;

public class SecondLargestNumberInAnArray {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		IOUtils.printArray(getSecondOrderElements(arr.length, arr));
	}
	
	public static int[] getSecondOrderElements(int n, int []a) {
        int smallest = a[0];
        int secondSmallest = Integer.MAX_VALUE;
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int x : a){
            if(x <  smallest){
               secondSmallest = smallest;
               smallest = x;
            }

            if(x < secondSmallest && x > smallest){
                secondSmallest = x;
            }

            if(x > largest){
                secondLargest = largest;
                largest = x;
            }

            if(x < largest && x > secondLargest){
                secondLargest = x;
            }
        }

        return new int[]{secondLargest, secondSmallest};
    }
}
