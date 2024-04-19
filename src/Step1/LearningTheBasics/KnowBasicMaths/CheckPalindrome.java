package Step1.LearningTheBasics.KnowBasicMaths;

import utilities.IOUtils;

public class CheckPalindrome {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		boolean isPalindrome = palindromeNumber(n);
		System.out.println(isPalindrome);
	}
	
    public static boolean palindromeNumber(int n){
        int reversedNumber = 0;
        int tempN = n;
        int mult = 10;

        while(tempN != 0){
            int rem = tempN % 10;
            tempN /= 10;
            reversedNumber = (reversedNumber  * mult) + rem;
        }
        return n == reversedNumber;
    }

}
