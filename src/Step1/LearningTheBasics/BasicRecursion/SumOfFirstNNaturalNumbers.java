package Step1.LearningTheBasics.BasicRecursion;

import utilities.IOUtils;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		System.out.println(sumFirstN(IOUtils.takeLongInput()));
	}
	
	public static long sumFirstN(long n) {
        return (n * (n + 1)) / 2;
    }
}
