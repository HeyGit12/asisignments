package Assignment_10;

import java.util.*;

public class Question_26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String str = scan.next();

		System.out.println(uniqueChars(str));

	}

	public static String uniqueChars(String word) {

		String dummy = "";
		for (int i = 0; i < word.length(); i++) {
			if (!dummy.contains(word.substring(i, i + 1))) {
				dummy += word.substring(i, i + 1);
			}
		}
		return dummy;
	}
}