package Step1.LearningTheBasics.KnowBasicMaths;

import utilities.IOUtils;

public class CheckArmstrong {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		int inputNumber = n;
		int pow = countDigits(n);
		int armstrongNumber = 0;

		while (n != 0) {
			int rem = n % 10;
			n /= 10;

			armstrongNumber += Math.pow(rem, pow);
		}

		System.out.println(armstrongNumber == inputNumber);
	}

	private static int countDigits(int number) {
		int numberOfDigits = 0;

		while (number != 0) {
			number /= 10;
			numberOfDigits++;
		}

		return numberOfDigits;
	}
}
