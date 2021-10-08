package csv;

import java.util.Arrays;

public class Challenge2 {
	public static String sortCsvColumns(String csv_data) {
		// split csv_data into an array where the regex is the "\n"
		String[] arraySplitResult = splitData(csv_data, "\\n");

		// split each element of the array into another array where the regex is the ","

		String[] originalNames = splitData(arraySplitResult[0], ",");
		String[] originalnumbers1 = splitData(arraySplitResult[1], ",");
		String[] originalnumbers2 = splitData(arraySplitResult[2], ",");

		// copy the original array of names into another array
		String[] copyNames = Arrays.copyOf(originalNames, originalNames.length);

		// sort the copied array
		Arrays.sort(copyNames);

		String namesOutput = "";
		String numbers1Output = "";
		String numbers2Output = "";



		// for each element in the copied array
		for (int i = 0; i < copyNames.length; i++) {
			for (int j = 0; j < originalNames.length; j++) {
				// get its name

				// for each element in the original array


				// find the index of the copied name in the original array
				if (copyNames[i].equals(originalNames[j])) {

					// use that index to build the output strings
					namesOutput += copyNames[i] + ",";
					numbers1Output += originalnumbers1[j] + ",";
					numbers2Output += originalnumbers2[j] + ",";

				}
			}
		}

		namesOutput = namesOutput.substring(0, namesOutput.length() - 1);
		numbers1Output = numbers1Output.substring(0, numbers1Output.length() - 1);
		numbers2Output = numbers2Output.substring(0, numbers2Output.length() - 1);

		// concatenate the output strings
		// return the concatenated string
		return namesOutput + "\n" + numbers1Output + "\n" + numbers2Output;
	}

	public static String[] splitData(String data, String regex) {
		String arr[] = data.split(regex);
		return arr;

	}



}