package challenges;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class JavaEofTest {

	private final JavaEof javaEof = new JavaEof();

	@Test
	public void testOneLine() {
		String input = "new line added";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		String parsedLines = javaEof.parseInput(in);
		assertEquals("1 new line added", parsedLines);
	}

	@Test
	public void testTwoLines() {
		String input = "new line added\nanother line\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		String parsedLines = javaEof.parseInput(in);
		assertEquals("1 new line added\n2 another line", parsedLines);
	}

	@Test
	public void testThreeLines() {
		String input = "Hello world\nI am a file\nRead me until end-of-file.";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		String parsedLines = javaEof.parseInput(in);
		assertEquals("1 Hello world\n2 I am a file\n3 Read me until end-of-file.", parsedLines);
	}

	@Test
	public void testNoLines() {
		String input = "\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		String parsedLines = javaEof.parseInput(in);
		assertEquals("", parsedLines);
	}

}
