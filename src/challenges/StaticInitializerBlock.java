package challenges;

import java.util.Scanner;

public class StaticInitializerBlock {

	private static boolean flag;
	private static int B,H;

	static {
		flag = true;
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();

		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}

		sc.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);

		}
	}

}
