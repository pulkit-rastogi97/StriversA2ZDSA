package Step1.LearningTheBasics.KnowBasicMaths;

import utilities.IOUtils;

public class CheckPrime {

	public static void main(String[] args) {
		int num = IOUtils.takeIntInput();
		String isPrime = isPrime(num);
		System.out.println(isPrime);
	}

	public static String isPrime(int num) {
		if (num < 2) {
			return "NO";
		}
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0) {
				return "NO";
			}
		}
		return "YES";
	}
}
