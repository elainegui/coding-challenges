package challenges;

import java.util.Scanner;

//from https://www.hackerrank.com/challenges/java-loops/problem
public class JavaLoops2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			System.out.println(calculateLine(a, b, n));
		}
		in.close();
	}

	public static String calculateLineMember(int a, int b, int n) {
		int calc = a;
		for (int i = 0; i < n; i++) {
			calc += (Math.pow(2, i)) * b;
		}
		return Integer.valueOf(calc).toString();
	}

	public static String calculateLine(int a, int b, int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			result += calculateLineMember(a, b, i) + " ";
		}
		return result.substring(0, result.length() - 1);
	}
}
