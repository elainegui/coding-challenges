package challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaLoops2Test {

	@Test
	public void test_basic_case_n1() {
		String result = JavaLoops2.calculateLineMember(0, 2, 1);
		assertEquals("2", result);
	}

	@Test
	public void test_basic_case_n2() {
		String result = JavaLoops2.calculateLineMember(0, 2, 2);
		assertEquals("6", result);
	}

	@Test
	public void test_basic_case_n10() {
		String result = JavaLoops2.calculateLineMember(0, 2, 10);
		assertEquals("2046", result);
	}

	@Test
	public void test_line_n2() {
		String result = JavaLoops2.calculateLine(0, 2, 2);
		assertEquals("2 6", result);
	}

	@Test
	public void test_line_n10() {
		String result = JavaLoops2.calculateLine(0, 2, 10);
		assertEquals("2 6 14 30 62 126 254 510 1022 2046", result);
	}

	@Test
	public void test_line_n5() {
		String result = JavaLoops2.calculateLine(5, 3, 5);
		assertEquals("8 14 26 50 98", result);
	}
}
