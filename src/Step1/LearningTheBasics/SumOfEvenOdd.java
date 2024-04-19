package Step1.LearningTheBasics;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		int evenSum = 0;
		int oddSum = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;

			if (rem % 2 == 0) {
				evenSum += rem;
			} else {
				oddSum += rem;
			}
		}
		System.out.println(evenSum + " " + oddSum);
	}
}
