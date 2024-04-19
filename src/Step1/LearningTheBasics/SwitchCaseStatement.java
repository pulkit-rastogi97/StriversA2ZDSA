package Step1.LearningTheBasics;

public class SwitchCaseStatement {

	public static void main(String[] args) {
//		int ch = IOUtils.takeIntInput();
		double[] a = IOUtils.takeArrayInputDouble();
		double result = areaSwitchCase(a.length, a);
		System.out.println(result);
	}

	public static double areaSwitchCase(int ch, double[] a) {
		switch (ch) {
		case 1:
			return Math.PI * a[0] * a[0];
		case 2:
			return a[0] * a[1];
		}

		return a[0];
	}
}
