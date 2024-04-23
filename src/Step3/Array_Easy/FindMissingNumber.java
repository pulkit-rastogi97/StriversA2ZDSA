package Step3.Array_Easy;

import utilities.IOUtils;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] nums = IOUtils.takeArrayInput();
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumByFormula = (n * ( n + 1)) / 2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        return sumByFormula - sum;
    }
}
