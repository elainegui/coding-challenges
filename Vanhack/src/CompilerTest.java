
public class CompilerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiler comp = new Compiler();

		comp.pass1("[ a b ] a*b");

		Compiler.tokenize("[ a b ] a*a + b*b");


		Compiler.tokenize("[ a b ] (a+ b)/2");
		Compiler.tokenize("[ a b ] (a+(b+2))/2");

	}

}
