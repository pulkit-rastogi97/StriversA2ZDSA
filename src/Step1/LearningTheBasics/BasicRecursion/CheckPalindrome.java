package Step1.LearningTheBasics.BasicRecursion;

import utilities.IOUtils;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str = IOUtils.takeStringInput();
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
        return checkPalindrome(0, str.length() - 1, str);
    }

    private static boolean checkPalindrome(int low, int high, String str){
        if(low >= high){
            return true;
        }

        if(str.charAt(low) != str.charAt(high)){
            return false;
        }

       return checkPalindrome(low + 1, high - 1, str);
    }
}	
