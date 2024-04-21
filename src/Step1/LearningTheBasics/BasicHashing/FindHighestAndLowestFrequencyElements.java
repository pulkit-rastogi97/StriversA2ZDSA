package Step1.LearningTheBasics.BasicHashing;


import java.util.HashMap;
import java.util.Map;

import utilities.IOUtils;

/**
 * Question link: https://www.naukri.com/code360/problems/k-most-occurrent-numbers_625382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 * @author pulkit-rastogi97
 *
 */
public class FindHighestAndLowestFrequencyElements {
	public static void main(String[] args) {
		int[] values = IOUtils.takeArrayInput();
		IOUtils.printArray(getFrequencies(values));
	}
	
	public static int[] getFrequencies(int []v) {
        HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
        for(int i = 0; i < v.length; i++){
            Integer frequency = frequencies.get(v[i]);
            frequency = frequency == null ? 0 : frequency;
            frequencies.put(v[i], frequency + 1);
        }

        int minFrequency =  Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;

        int minFrequencyElement = -1;
        int maxFrequencyElement = -1;

        for(Map.Entry<Integer, Integer> frequencyEntry : frequencies.entrySet()){
            int frequency = frequencyEntry.getValue();
            int element = frequencyEntry.getKey();

            if(frequency < minFrequency){
                minFrequency = frequency;
                minFrequencyElement = element;
            }

            if(frequency == minFrequency){
                if(element < minFrequencyElement){
                    minFrequencyElement = element;
                }
            }

            if(frequency > maxFrequency){
                maxFrequency = frequency;
                maxFrequencyElement = element;
            }

            if(frequency == maxFrequency){
                if(element < maxFrequencyElement){
                    maxFrequencyElement = element;
                }
            }
        }

        int[] result = new int[2];
        result[0] = maxFrequencyElement;
        result[1] = minFrequencyElement;

        return result;
    }
}
