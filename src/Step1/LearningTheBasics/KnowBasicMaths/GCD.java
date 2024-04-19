package Step1.LearningTheBasics.KnowBasicMaths;

import utilities.IOUtils;

public class GCD {
	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		int m = IOUtils.takeIntInput();
		
		int gcd = calcGCD(n, m);
		System.out.println(gcd);
	}
	
	public static int calcGCD(int n, int m){
        int divisor = n < m ? n : m;
        int dividend = (divisor == n) ? m : n;
        int remainder = dividend % divisor;

        while(remainder != 0){
            dividend = divisor;
            divisor = remainder;

            remainder = dividend % divisor;
        }

        return divisor;
    }
}
