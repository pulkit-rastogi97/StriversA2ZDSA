package Step1.LearningTheBasics.KnowBasicMaths;

import utilities.IOUtils;

public class ReverseBits {

	public static void main(String[] args) {
		long n = IOUtils.takeLongInput();
		long number = reverseBits(n);
		System.out.println(number);
	}
	
	public static long reverseBits(long n) {
		long mult =  (long) Math.pow(2, 31);
		long result = 0;
		while(n != 0){
			long rem = n % 2;
			n /= 2;

			result += rem * mult;
			mult /= 2;
		}
		return result;
	}
}
