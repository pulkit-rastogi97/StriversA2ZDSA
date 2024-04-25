package ProblemOfTheDay;

import java.util.ArrayList;

import utilities.IOUtils;

public class RotateAnArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr = IOUtils.takeListInput();
		int k = IOUtils.takeIntInput();
		IOUtils.printList(rotateArray(arr, k));
	}
	
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        
        //1. complete array reverse
        for(int i = 0; i < arr.size()/2; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - 1 - i));
            arr.set(arr.size() - 1 - i, temp);
        }

        //2. reverse k elements.
        k = arr.size() - k;

        int st = 0;
        int ed = k - 1 ;

        while(st < ed){
            int temp = arr.get(st);
            arr.set(st, arr.get(ed));
            arr.set(ed, temp);

            st++;
            ed--;
        }

        st = k;
        ed = arr.size() - 1;

        while(st < ed){
            int temp = arr.get(st);
            arr.set(st, arr.get(ed));
            arr.set(ed, temp);

            st++;
            ed--;
        }


        return arr;
    }
}
