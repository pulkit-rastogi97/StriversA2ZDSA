package Step3.Array_Easy;

import utilities.IOUtils;

public class RemovedDuplicatesSortedArray {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		System.out.println(removeDuplicates(arr, arr.length));
	}
	
    public static int removeDuplicates(int[] arr,int n) {
        int i = 0;
        while(i < arr.length - 1){
            int j = i + 1;
            while(j < arr.length && arr[i] == arr[j]){
                j++;
                n--;
            }
            i = j;
        }
        return n;
    }
}
