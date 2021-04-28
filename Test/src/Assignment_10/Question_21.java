package Assignment_10;

import java.util.Scanner;

public class Question_21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter da word: ");
		String word = scan.next();
		System.out.println("Guess how many times?");
		int guess = scan.nextInt();

		String prefix = word.substring(0, guess);

		int count = 0;
		String word2 = word.substring(0, guess);
		for (int i = 0; i < word.length() - guess; i++) {
			if (word.subSequence(i, i + guess).equals(word2)) {
				count++;
			}

		}

		if (count == guess) {
			System.out.println(true);
			System.out.println(prefix + " appears " + count  + " times");
		} else {
			
			System.out.println(false);
			System.out.println(prefix + " appears " + count);

		}

	}

}
