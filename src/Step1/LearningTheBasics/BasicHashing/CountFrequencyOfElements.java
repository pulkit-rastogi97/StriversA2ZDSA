package Step1.LearningTheBasics.BasicHashing;

import utilities.IOUtils;

public class CountFrequencyOfElements {
	public static void main(String[] args) {
		int[] nums = IOUtils.takeArrayInput();
		int x = IOUtils.takeIntInput();
		int[] result = countFrequency(nums.length, x, nums);
		IOUtils.printArray(result);
	}
	
	public static int[] countFrequency(int n, int x, int []nums){
        int[] frequencyMap = new int[n];

        for(int val : nums){
            if(val <= nums.length)
                frequencyMap[val - 1] += 1;
        }

        return frequencyMap;
    }
}
