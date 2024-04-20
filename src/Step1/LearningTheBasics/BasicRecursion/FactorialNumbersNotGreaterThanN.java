package Step1.LearningTheBasics.BasicRecursion;

import java.util.ArrayList;
import java.util.List;

import utilities.IOUtils;

/**
 * Question Link: https://www.naukri.com/code360/problems/factorial-numbers-not-greater-than-n_8365435?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
 * 
 * @author pulkit-rastogi97
 *
 */
public class FactorialNumbersNotGreaterThanN {

	public static void main(String[] args) {
		long n = IOUtils.takeLongInput();
		IOUtils.printList(factorialNumbers(n));
	}
	
	public static List<Long> factorialNumbers(long n) {
        long factorial = 1;
        long start = 1;
        List<Long> factorials = new ArrayList<>();
        while(factorial < n){
            factorial *= start ;
                if(factorial <= n){
                    factorials.add(factorial);
                }
            start++;
        }
        return factorials;
    }

}
