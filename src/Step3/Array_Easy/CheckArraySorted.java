package Step3.Array_Easy;

import utilities.IOUtils;

public class CheckArraySorted {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		System.out.println(isSorted(arr.length, arr));
	}
	
	public static int isSorted(int n, int []a) {
        for(int i = 1; i < a.length; i++){
            if(a[i - 1] > a[i]){
                return 0;
            }
        }
        return 1;
    }
}
