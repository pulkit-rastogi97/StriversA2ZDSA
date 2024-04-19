package Step1.LearningTheBasics.KnowBasicMaths;

import utilities.IOUtils;

public class CountDigits {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		System.out.println(n);
	}
	
    public static int countDigits(int n){
        int noOfDigits = 0;

        while(n != 0){
            n /= 10;
            noOfDigits++;
        }

        return noOfDigits;
}
}
