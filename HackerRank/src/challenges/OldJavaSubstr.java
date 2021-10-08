package challenges;

import java.util.Scanner;

public class OldJavaSubstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int k = sc.nextInt();

		System.out.println(getSmallestAndLargest(input, k));
	}

	//return the first (lexicographically smallest) substring and the last (lexicographically largest)
	//substring as two newline-separated values (i.e., ava\nwel).
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		//get the substrings
		String[] substrings = generateSubstrings(s, k);
		System.out.println(substrings.toString());

		/*String strTemp = "";
		if (s.length() > 3) {
			strTemp = s.substring(0, 3);
		} else {
			return s;
		}
		//int maxDistance = Character.toString(s.charAt(0)).compareTo(Character.toString(s.charAt(2)));
		int maxDistance = Math.abs(s.charAt(0) - s.charAt(3));
		smallest = largest = strTemp;
		int minDistance = maxDistance;

		for (int i = 1; i < s.length() - 2; i++) {
			strTemp = s.substring(i, i + 3);
			int charsDistanceFound = Math.abs(strTemp.charAt(0) - strTemp.charAt(2));

			if (charsDistanceFound > maxDistance) {
				maxDistance = charsDistanceFound;
				largest = strTemp;
			}
			if (charsDistanceFound < minDistance) {
				minDistance = charsDistanceFound;
				smallest = strTemp;
			}
		}*/

		return smallest + "\n" + largest;
	}

	//generate the substrings
	public static String[] generateSubstrings(String s, int k) {
		String[] substrGenerated = new String[s.length() - k + 1];
		for (int i = 0; i < s.length() - 2; i++) {
			if ((i + k) != s.length()) {
				substrGenerated[i] = s.substring(i, i + k);
			} else {
				substrGenerated[i] = s.substring(i);

				//substrGenerated[i] += String.valueOf(j).toString();
				//substrGenerated[i] += substrGenerated[i].concat(Character.toString(s.charAt(j)));

			}

		}
		return substrGenerated;
	}
}
