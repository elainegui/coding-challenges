package challenges;

import java.io.InputStream;
import java.util.Scanner;

public class JavaEof {

	public static void main(String[] args) {
		JavaEof javaEof = new JavaEof();

		System.out.println(javaEof.parseInput(System.in));

	}

	public String parseInput(InputStream is) {
		Scanner sc = new Scanner(is);

		int counter = 1;
		String result = "";

		String lineRead = sc.nextLine();
		if (!lineRead.isEmpty()) {
			result += counter + " " + lineRead;
		}

		while (sc.hasNext()) {
			counter++;
			result += "\n";

			lineRead = sc.nextLine();
			result += counter + " " + lineRead;
		}
		sc.close();
		return result;
	}

}
