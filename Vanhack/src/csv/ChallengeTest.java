package csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChallengeTest {
	Challenge challenge = new Challenge();


	@Test
	void testSplitDataRows() {
		String rawInput = "Beth,Charles,Danielle,Adam,Eric\n17945,10091,10088,3907,10132\n2,12,13,48,11";
		String[] expectedOutput = { "Beth,Charles,Danielle,Adam,Eric", "17945,10091,10088,3907,10132",

				"2,12,13,48,11" };
		assertArrayEquals(expectedOutput, Challenge.splitData(rawInput, "\\n"));
	}

	@Test
	void testSplitFirstRow() {
		String rawInput = "Beth,Charles,Danielle,Adam,Eric";
		String[] expectedOutput = { "Beth", "Charles", "Danielle", "Adam", "Eric" };

		assertArrayEquals(expectedOutput, Challenge.splitData(rawInput, ","));
	}



	@Test

	public void testSortCsvColumnsMethod() {
		assertEquals("Adam,Beth,Charles,Danielle,Eric\n3907,17945,10091,10088,10132\n48,2,12,13,11", Challenge
				.sortCsvColumns("Beth,Charles,Danielle,Adam,Eric\n17945,10091,10088,3907,10132\n2,12,13,48,11"));
	}



}
