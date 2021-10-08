package challenges;

public class JavaSubstr {

	public static String[] generateSubstrings(String base, int substringSize) {
		String[] result = new String[base.length() - substringSize + 1];

		for (int index = 0; index < base.length() - substringSize + 1; index++) {
			result[index] = base.substring(index, substringSize + index);
		}
		return result;
	}


	public static String[] orderElements(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int j = i + 1;
			for (; j < array.length; j++) {
				if (array[i].compareTo(array[j]) > 0) {
					String strFirst = array[i];
					String strSecond = array[j];
					array[i] = strSecond;
					array[j] = strFirst;
				}

			}
		}

		return array;
	}


	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// generate array of substrings
		String[] array = new String[s.length() - k + 1];
		array = JavaSubstr.generateSubstrings(s, k);

		// order array of substrings
		array = JavaSubstr.orderElements(array);

		// get first and last elements
		smallest = array[0];
		largest = array[array.length - 1];

		return smallest + "\n" + largest;
	}
	/*
	 * public static void main(String[] args) {
	 * JavaSubstr.orderElements(new String[] { "hell", "ello", "lloj", "loja",
	 * "ojav", "java" });
	 * }
	 */

	/*
	 * public static String getSmallestAndLargest(String s, int k) {
	 *
	 *
	 * return "";
	 * }
	 */



/*
 * public static int calculateDistance(String str) {
 * char firstLetter = str.charAt(0);
 * char lastLetter = str.charAt(str.length() - 1);
 * System.out.println(firstLetter - lastLetter);
 * return Math.abs(firstLetter - lastLetter);
 * }
 */





	/*
	 * String smallest = resultSubstrings.get(0);
	 * String largest = smallest;
	 * int smallestDistance = calculateDistance(resultSubstrings.get(0));
	 * int largestDistance = smallestDistance;
	 */
	/*
	 * for (int i = 1; i < resultSubstrings.size(); i++) {
	 * String currentStr = resultSubstrings.get(i);
	 * int distance = calculateDistance(currentStr);
	 * if (distance < smallestDistance) {
	 * smallest = currentStr;
	 * smallestDistance = distance;
	 * }
	 *
	 * if (distance > largestDistance) {
	 * largest = currentStr;
	 * largestDistance = distance;
	 * }
	 * }
	 */


	// return
	// resultSubstrings.get(0)+"\n"+resultSubstrings.get(resultSubstrings.size()-1);
// }

}
