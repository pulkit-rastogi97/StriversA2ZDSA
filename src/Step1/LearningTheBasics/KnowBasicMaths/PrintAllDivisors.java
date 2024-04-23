package Step1.LearningTheBasics.KnowBasicMaths;

import utilities.IOUtils;

public class PrintAllDivisors {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		System.out.println(sumOfAllDivisors(n));

	}

	private static int sumOfAllDivisors(int N) {
		int sum = 0;

		// Iterating from 1 to N.
		for (int i = 1; i <= N; i++) {
			// Calculating and accumulating the sum of divisors.
			sum += (N / i) * i;
		}

		// Returning the sum of divisors.
		return sum;
	}
}
