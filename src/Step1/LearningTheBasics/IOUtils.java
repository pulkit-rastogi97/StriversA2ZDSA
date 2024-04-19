package Step1.LearningTheBasics;

import java.util.Scanner;

public class IOUtils {
	private static Scanner scan = new Scanner(System.in);
	
	public static int[] takeArrayInput() {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public static double[] takeArrayInputDouble() {
		int n = scan.nextInt();
		double[] arr = new double[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextDouble();
		}
		return arr;
	}
	
	public static int takeIntInput() {
		return scan.nextInt();
	}
	
	public static void printArray(int[] arr) {
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
	
	public static void printArray(int start, int end, int[] arr) {
		for(int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static String takeStringInput() {
		return scan.next();
	}
}