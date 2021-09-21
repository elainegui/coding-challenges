package challenges;

import java.util.Scanner;

public class Anagram {
	static boolean isAnagram(String a, String b) {




		/*
		 * if(a.length()==b.length()){
		 * int i = 0;
		 * char[] bCharArray = b.toCharArray();
		 * while(b.indexOf(a.charAt(i))!=-1){
		 * char[] newArr = new char[a.length()-1 -i];}
		 * for(char c: bCharArray) {
		 *
		 * }
		 */
		return false;

	}

// static boolean isAnagram (String a, String b) {
// if(a.length()==b.length()){
// int i = 0;
// char[] bCharArray = b.toCharArray();
// while(b.contains(a.charAt(i)){
// char[] newArr = new char[a.length()-1 -i];
// System.arrayCopy();
// }
// }
//
// return false;
// }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}



