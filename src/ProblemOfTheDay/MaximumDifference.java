package ProblemOfTheDay;

import utilities.IOUtils;

public class MaximumDifference {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		String result = maximumDifference(arr.length, arr);
		System.out.println(result);
	}
	
	public static String maximumDifference(int n, int[] arr) {
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 0;i < n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
         }
        
        int diff = max - min;
        return diff%2 == 0? "EVEN" : "ODD";
    }
}
