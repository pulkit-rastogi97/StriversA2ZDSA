package Step1.LearningTheBasics.LearningTheBasicsThingsToKnowInJava;

import java.util.Scanner;

/**
 * 
 * Question Link:
 * https://www.naukri.com/code360/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
 * 
 * @author pulkit-rastogi97
 *
 */
public class FindCharacterCase {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(1);
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
        
        scan.close();
    }
}
