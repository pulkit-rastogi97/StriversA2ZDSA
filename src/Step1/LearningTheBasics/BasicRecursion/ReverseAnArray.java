package Step1.LearningTheBasics.BasicRecursion;

import utilities.IOUtils;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] nums = IOUtils.takeArrayInput();
		nums = reverseArray(nums.length, nums);
		IOUtils.printArray(nums);
	}

	public static int[] reverseArray(int n, int[] nums) {
		reverseArray(0, nums.length - 1, nums);
		return nums;
	}

	private static void reverseArray(int low, int high, int[] nums) {
		if (low >= high) {
			return;
		}

		int temp = nums[low];
		nums[low] = nums[high];
		nums[high] = temp;

		reverseArray(low + 1, high - 1, nums);
	}
}
