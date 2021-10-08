package challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class JavaSubstrTest {

	@Test
	public void should_generate_correct_array_of_substrings() {
		assertEquals(Arrays.toString(JavaSubstr.generateSubstrings("casa", 3)),
				Arrays.toString(new String[] { "cas", "asa" }));
		assertEquals(Arrays.toString(JavaSubstr.generateSubstrings("casados", 4)),
				Arrays.toString(new String[] { "casa", "asad", "sado", "ados" }));
	}

	@Test
	public void order_Array_2_elements() {
		assertEquals(Arrays.toString(JavaSubstr.orderElements(new String[] { "cas", "asa" })),
				Arrays.toString(new String[] { "asa", "cas" }));
	}

	@Test
	public void order_Array_9_elements() {
		assertEquals(Arrays.toString(new String[] { "ello", "hell", "java", "lloj", "loja", "ojav" }), Arrays
				.toString(JavaSubstr.orderElements(new String[] { "hell", "ello", "lloj", "loja", "ojav", "java" })));
	}

	@Test
	public void getFirstAndSecondElements() {
		assertEquals("ello\nojav", JavaSubstr.getSmallestAndLargest("hellojava", 4));
	}


	/*
	 * @ParameterizedTest
	 *
	 * @MethodSource("userInputDataProvider")
	 * public void should_generate_correct_array_of_substrings(String stringBase,
	 * int substringSize,
	 * String[] expectedOutcome) {
	 *
	 * String[] outcome = new String[stringBase.length() - 2];
	 * outcome = javaSubstr.generateSubstrings(stringBase, substringSize);
	 *
	 * assertEquals(expectedOutcome, outcome);
	 * }
	 *
	 * private static Stream<Arguments> userInputDataProvider() {
	 *
	 * return Stream.of(Arguments.of("casa", 3, Arrays.toString(new String[] {
	 * "cas", "asa" })));
	 * // Arguments.of("welcome", 4, buildList("welc", "elco", "lcom", "come")),
	 * // Arguments.of("wel", 3, buildList("wel")));
	 * }
	 */





}
