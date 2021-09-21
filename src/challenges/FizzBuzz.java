package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

	/*
	 * Complete the 'fizzBuzz' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void fizzBuzz(int n) {
		String output = "";



	}

}

public class FizzBuzz {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Solution.fizzBuzz(n);

		bufferedReader.close();
	}
}