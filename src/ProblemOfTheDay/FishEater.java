package ProblemOfTheDay;

import utilities.IOUtils;

public class FishEater {

	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		System.out.println(fishEater(arr));
	}
	
	public static int fishEater(int[] arr) {
        int fishes = arr.length; 
        int biggestFishYet = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(biggestFishYet > arr[i]){
                fishes--;
            }else{
                biggestFishYet = arr[i];
            }
        }
        return fishes;
    }

}
