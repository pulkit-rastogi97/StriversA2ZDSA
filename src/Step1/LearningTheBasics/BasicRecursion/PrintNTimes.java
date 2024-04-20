package Step1.LearningTheBasics.BasicRecursion;

import java.util.ArrayList;
import java.util.List;

import utilities.IOUtils;

public class PrintNTimes {

	public static void main(String[] args) {
		int n = IOUtils.takeIntInput();
		List<String> names = printNtimes(n);
		System.out.println(names);
	}

	public static List<String> printNtimes(int n) {
		List<String> names = new ArrayList<>();
		addNames(names, n);
		return names;
	}

	private static void addNames(List<String> names, int n) {
		if (n <= 0)
			return;

		names.add("Coding Ninjas");
		addNames(names, n - 1);
	}
}
