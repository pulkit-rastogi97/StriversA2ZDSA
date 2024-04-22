package ProblemOfTheDay;

import utilities.IOUtils;

/**
 * Question Link: https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1
 * @author pulkit-rastogi97
 *
 */
public class MinimumNumberOfOnes {
	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		int m = IOUtils.takeIntInput();
		int[][] a = IOUtils.take2DArrayInput();
		
		int indexOfRow = minRow(n, m, a);
		System.out.println(indexOfRow);
	}
	
	private static int minRow(int n, int m, int a[][]) {
        int index = 0;
        int minOnesCount = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < m; j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
            if(count < minOnesCount){
                minOnesCount = count;
                index = i;
            }
        }
        
        return index + 1;
    }
}
