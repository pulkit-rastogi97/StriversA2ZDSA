package Step3.Array_Easy;

import utilities.IOUtils;

/**
 * Question Link: https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 * @author pulkit-rastogi97
 *
 */
public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		int[] arr = IOUtils.takeArrayInput();
		long k = IOUtils.takeLongInput();
		System.out.println(longestSubarrayWithSumK(arr, k));
	}

	public static int longestSubarrayWithSumK(int[] a, long sumK) {
		int maxLen = 0;
		int i = 0;
		int j = 0;

		long sum = 0;

		while (j < a.length) {
			sum += a[j];
			j++;

			while (sum > sumK) {
				sum -= a[i];
				i++;
			}

			if (sum == sumK) {
				maxLen = Math.max(maxLen, j - i);
			}
		}

		return maxLen;
	}
}
