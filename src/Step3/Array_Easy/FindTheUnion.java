package Step3.Array_Easy;

import java.util.List;

import utilities.IOUtils;

import java.util.ArrayList;

public class FindTheUnion {
	public static void main(String[] args) {
		int[] a = IOUtils.takeArrayInput();
		int[] b = IOUtils.takeArrayInput();
		
		IOUtils.printList(sortedArray(a, b));
	}
	
	public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> mergedArray = new ArrayList<>();
        int i = 0; 
        int j = 0;
        int lastValue = -1;
        while(i < a.length || j < b.length){
            int aIndex = i < a.length ? i : -1;
            int bIndex = j < b.length ? j : -1;

            if(aIndex != -1 && bIndex != -1){
                if(a[aIndex] < b [bIndex]){
                   lastValue = validateAndAdd(lastValue, a[aIndex], mergedArray);
                    i++;
                }else if(a[aIndex] > b[bIndex]){
                    lastValue = validateAndAdd(lastValue, b[bIndex], mergedArray);
                    j++;
                }else{
                   lastValue = validateAndAdd(lastValue, a[aIndex], mergedArray);
                    i++;
                    j++;
                }
            }

            if(aIndex == -1){
                lastValue = validateAndAdd(lastValue, b[bIndex], mergedArray);
                j++;
            }

            if(bIndex == -1){
                lastValue = validateAndAdd(lastValue, a[aIndex], mergedArray);
                i++;
            }
        }
        return mergedArray;
    }

    private static int validateAndAdd(int lastValue, int currentValue, List<Integer> array){
        if(lastValue == currentValue){
            return lastValue;
        }
        array.add(currentValue);
        return currentValue;
    }
}
