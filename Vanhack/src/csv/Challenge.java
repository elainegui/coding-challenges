package csv;

import java.util.Arrays;

public class Challenge {

/*
 * Sort the columns of a csv-file
 * You get a string with the content of a csv-file.
 *
 * CSV Description:
 * The columns are separated by commas (,).
 * The rows are separated by a single newline (\n)
 * The first line contains the names of the columns.
 * A blank space counts as an empty string.
 * Treat every value as a string.
 * Your Task
 * Write a method that sorts the columns by the names of the columns
 * alphabetically, and case-insensitive.
 *
 * Specification
 * Challenge.sortCsvColumns(csvData)
 * Takes comma separated values and sorts it alphabetically
 *
 * Parameters
 * csvData: String - Unsorted CSV
 *
 * Return Value
 * String - Sorted CSV
 *
 * Example Input
 * Raw Input:
 *
 * Beth,Charles,Danielle,Adam,Eric\n
 * 17945,10091,10088,3907,10132\n
 * 2,12,13,48,11
 * As a Table:
 *
 * Beth Charles Danielle Adam Eric
 * 17945 10091 10088 3907 10132
 * 2 12 13 48 11
 * Example Output
 * Raw output:
 *
 * Adam,Beth,Charles,Danielle,Eric\n
 * 3907,17945,10091,10088,10132\n
 * 48,2,12,13,11
 * As a Table:
 *
 * Adam Beth Charles Danielle Eric
 * 3907 17945 10091 10088 10132
 * 48 2 12 13 11
 */


	public static String sortCsvColumns(String csv_data) {
		// calculate how many arrays will be created , dependinfg on the n. of "\\n"
		int nArraysToCreate = 1;
		String dataToAnalyze = csv_data;
		int beginIndex = 0;
		while (dataToAnalyze.indexOf("\n", beginIndex) != -1) {

			beginIndex = dataToAnalyze.indexOf("\n", beginIndex) + 1;
			nArraysToCreate++;
		}

		// create the arrays


		// find all "\n" tokens adn split into an array

		String[] arraySplitResult = splitData(csv_data, "\\n");

		// order first array index
		// split header data into an array
		String oldTableHeader = arraySplitResult[0];
		String[] arraySplitHeaderResult = splitData(oldTableHeader, ",");

		// make a copy of that array and sort
		String[] arraySplitHeaderResultCopy = Arrays.copyOf(arraySplitHeaderResult, arraySplitHeaderResult.length);
		Arrays.sort(arraySplitHeaderResultCopy);


		// create arrays for the other rows

		String row = "";


		for (int z = 1; z < arraySplitResult.length; z++) {
			// bring each element of the initial split and transform into an array
			String[] arraySplitResultRow = splitData(arraySplitResult[z], ",");
			// System.out.println("arraySplitResultRow" +
			// Arrays.toString(arraySplitResultRow));

			for (int i = 0; i < arraySplitHeaderResultCopy.length; i++) {
				// bring the first element of the header to compare
				String element = arraySplitHeaderResultCopy[i];
				// System.out.println("element" + element);

				for (int j = 0; j < arraySplitHeaderResult.length; j++) {
					if (element.equals(arraySplitHeaderResult[j])) {
						int indexFound = j;
						// System.out.println("j" + j);
						if (j != arraySplitHeaderResultCopy.length - 1) {
							row += arraySplitResultRow[indexFound] + ",";
						}
					}

				}

			}

			if (z != arraySplitResult.length - 1) {
				row += "\\n";
			}

		}

		System.out.println(row);



		//

		return "";
	}

	// compare the index of the sorted copy array with the original array
	// check the index then bring other data rows along





	// create Strings for rows





	public static String[] splitData(String data, String regex) {
		String arr[] = data.split(regex);
		return arr;

	}


}