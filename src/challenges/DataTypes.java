package challenges;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " " + checkNumberCapacity(x));
				//Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}

	}

	public static String checkNumberCapacity(long x) {
		//System.out.println(x + " can be fitted in:");
		String output = "can be fitted in:";
		if (x >= -128 && x <= 127) {
			output += "\n* byte";
		}

		if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
			output += "\n* short";
		}

		if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
			output += "\n* int";
		}

		if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
			output += "\n* long";
		}
		return output;

	}

}
