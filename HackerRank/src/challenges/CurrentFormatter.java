package challenges;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrentFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		System.out.println("US: " + convertPaymentToCurrency(payment, Locale.US));
		System.out.println("India: " + convertPaymentToCurrency(payment, new Locale("en", "in")));
		System.out.println("China: " + convertPaymentToCurrency(payment, Locale.CHINA));
		System.out.println("France: " + convertPaymentToCurrency(payment, Locale.FRANCE));
	}

	static String convertPaymentToCurrency(double currency, Locale locale) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currencyFormatted = formatter.format(currency);
		return currencyFormatted;
	}
}
