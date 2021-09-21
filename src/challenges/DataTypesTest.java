package challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DataTypesTest {

	@Test
	public void test_127() {
		DataTypes dt = new DataTypes();
		String returnedString = dt.checkNumberCapacity(127);
		assertEquals("can be fitted in:\n* byte\n* short\n* int\n* long", returnedString);
	}

	@Test
	public void test_150() {
		DataTypes dt = new DataTypes();
		String returnedString = dt.checkNumberCapacity(-150);
		assertEquals("can be fitted in:\n* short\n* int\n* long", returnedString);
	}

	@Test
	public void test_150000() {
		DataTypes dt = new DataTypes();
		String returnedString = dt.checkNumberCapacity(150000);
		assertEquals("can be fitted in:\n* int\n* long", returnedString);
	}

	@Test
	public void test_100000000000000() {
		DataTypes dt = new DataTypes();
		String returnedString = dt.checkNumberCapacity(-100000000000000L);
		assertEquals("can be fitted in:\n* long", returnedString);
	}

}
