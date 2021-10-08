import java.util.Deque;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compiler {
// public List<String> compile(String prog) {
// return pass3(pass2(pass1(prog)));
// }

	/**
	 * Returns an un-optimized AST
	 */
	public Ast pass1(String prog) {
		Deque<String> tokens = tokenize(prog);

		// extract * token
		System.out.println(tokens.contains("*"));

		// apply to BinOp (*, ...)
		// BinOp('*',a,b)

		// Ast result = new BinOp('*', tokens.contains("a"), second)


		return null;
	}



	// private static Deque<String> tokenize(String prog) {
	public static Deque<String> tokenize(String prog) {
		Deque<String> tokens = new LinkedList<>();
		Pattern pattern = Pattern.compile("[-+*/()\\[\\]]|[a-zA-Z]+|\\d+");
		Matcher m = pattern.matcher(prog);
		while (m.find()) {
			tokens.add(m.group());
		}
		tokens.add("$"); // end-of-stream

		System.out.println(tokens.toString());
		return tokens;
	}
}

interface Ast {
	public String op();


}

class BinOp implements Ast {
	Compiler comp = new Compiler();
	String oper;
	String first;
	String second;


	public BinOp(String oper, String first, String second) {
		this.oper = oper;
		this.first = first;
		this.second = second;
	}

	@Override
	public String op() {
		String mult = "*";
		return mult;
	}


// Ast a() {
// return new BinOp("",);
// }


}

class UnOp implements Ast {

	@Override
	public String op() {

		return null;
	}

}




// Ast a() {return }

// Ast b() {return}

// public BinOp(char oper, int a, int b) {

// if (c == '+') {
//
// }
// }
/*
 *
 * Ast a() {
 * return ;
 * }
 */
// }