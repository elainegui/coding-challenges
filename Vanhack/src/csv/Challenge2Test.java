package csv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Challenge2Test {

	@Test
	void sortCsvColumnsTest() {
		assertEquals("Adam,Beth,Charles,Danielle,Eric\n3907,17945,10091,10088,10132\n48,2,12,13,11", Challenge2
				.sortCsvColumns("Beth,Charles,Danielle,Adam,Eric\n17945,10091,10088,3907,10132\n2,12,13,48,11"));
	}
}

