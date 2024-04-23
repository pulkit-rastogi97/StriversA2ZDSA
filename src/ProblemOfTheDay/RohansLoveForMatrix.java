package ProblemOfTheDay;

import utilities.IOUtils;

/**
 * Question Link: https://www.geeksforgeeks.org/problems/rohans-love-for-matrix4723/1
 * 
 * @author pulkit-rastogi97
 *
 */
public class RohansLoveForMatrix {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		System.out.println(firstElement(n));
	}
	
	private static int firstElement(int n) {
        int first = 1;
        int second = 1;
        
        if(n <= 2){
            return 1;
        }
        
        n -= 2;
        
        int sum = 0;
        while(n-- > 0){
            sum = (first + second) % 1000000007;
            first = second;
            second = sum;
        }
        
        return second % 1000000007;
    }

}
