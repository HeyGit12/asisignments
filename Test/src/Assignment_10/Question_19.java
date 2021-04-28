package Assignment_10;

import java.util.*;

public class Question_19 {

	public static void main(String[] args) {

		System.out.println(counter(null));

	}

	public static int counter(String word) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter da word: ");
		word = scan.next();

		int count = 0;

		for (int i = 0; i < word.length() - 3; i++) {
			if (word.subSequence(i, i + 4).equals("java")) {
				count++;
			}

		}
		
		return count;

	}

}