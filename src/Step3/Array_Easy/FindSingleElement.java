package Step3.Array_Easy;

import utilities.IOUtils;

public class FindSingleElement {
	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		System.out.println(getSingleElement(arr));
	}
	
    public static int getSingleElement(int []arr){
        for(int i = 0; i < arr.length - 1; i += 2){
            if(arr[i] != arr[i + 1]){
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }
}
