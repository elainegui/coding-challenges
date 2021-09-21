package challenges;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

public class CurrentFormatterTest {

	@Test
	public void testUsingLoop() {
		Locale[] locales = new Locale[] { Locale.US, new Locale("en", "in"), Locale.CHINA, Locale.FRANCE };
		String[] expectedOutcomes = new String[] { "$12,324.13", "Rs.12,324.13", "￥12,324.13", "12 324,13 €" };
		double valueToFormat = 12324.134;
		for (int index = 0; index < locales.length; index++) {
			testConversion(valueToFormat, locales[index], expectedOutcomes[index]);
		}

	}

	private void testConversion(double valueToFormat, Locale inputLocale, String expectedOutcome) {
		String formattedValue = CurrentFormatter.convertPaymentToCurrency(valueToFormat, inputLocale);
		assertEquals(expectedOutcome, formattedValue);

	}

/*	@Test
	public void testUSFormat() {
		CurrentFormatter currFormat = new CurrentFormatter();
		double currency = 12324.134;
		String currenceReturned = currFormat.convertPaymentToCurrency(currency, Locale.US);
		assertEquals("$12,324.13", currenceReturned);
	}

	@Test
	public void testIndiaFormat() {
		CurrentFormatter currFormat = new CurrentFormatter();
		double currency = 12324.134;
		Locale l = new Locale("en", "in");
		String currenceReturned = currFormat.convertPaymentToCurrency(currency, l);
		assertEquals("Rs.12,324.13", currenceReturned);
	}

	@Test
	public void testChinaFormat() {
		CurrentFormatter currFormat = new CurrentFormatter();
		double currency = 12324.134;
		String currenceReturned = currFormat.convertPaymentToCurrency(currency, Locale.CHINA);
		assertEquals("￥12,324.13", currenceReturned);
	}

	@Test
	public void testFranceFormat() {
		CurrentFormatter currFormat = new CurrentFormatter();
		double currency = 12324.134;
		String currenceReturned = currFormat.convertPaymentToCurrency(currency, Locale.FRANCE);
		assertEquals("12 324,13 €", currenceReturned);
	}*/
}
