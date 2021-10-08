package challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OldJavaSubstrTest {

	@Test
	public void testGenerateSubstrings3() {
		String s = "wel";
		int k = 3;
		assertEquals(OldJavaSubstr.generateSubstrings(s, k), new String[] { "wel" });
	}

	@Test
	public void testGenerateSubstrings4() {
		String s = "welc";
		int k = 3;
		assertEquals(OldJavaSubstr.generateSubstrings(s, k), new String[] { "wel", "elc" });
	}

	@Test
	public void testGenerateSubstrings5() {
		String s = "welc";
		int k = 4;
		assertEquals(OldJavaSubstr.generateSubstrings(s, k), new String[] { "welc" });
	}

}
