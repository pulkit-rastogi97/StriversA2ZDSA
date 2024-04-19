package Step1.LearningTheBasics.LearningTheBasicsThingsToKnowInJava;

import utilities.IOUtils;

/**
 * Question Link: https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
 * 
 * @author pulkit-rastogi97
 *
 */
public class NthFibonacciNumber {
	public static void main(String[] args) {		
		int n = IOUtils.takeIntInput();

		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}
}
