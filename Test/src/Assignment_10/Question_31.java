package Assignment_10;

import java.util.Scanner;

public class Question_31 {

	public static void main(String[] args) {
		/*
		 * Question-31
		 * 
		 * Palindrome is a word, phrase, or sequence that reads the same backward as
		 * forward, e.g., madam or nurses run.
		 * 
		 * So method isPalindrome checks that and returns true if check is palindrome
		 * and false if it is not.
		 * 
		 * - make your conditions case insensitive. ex: Civic and civic are both
		 * palindromes - make your conditions space insensitive. Race car is a
		 * palindrome even though there is space in between.
		 * 
		 * Sample Output:
		 * 
		 * isPalindrome("Noon") ==> true
		 * 
		 * isPalindrome("I am not palindrome") ==> false
		 * 
		 * isPalindrome("wooden") ==> false
		 * 
		 * isPalindrome("Nurses Run") ==> true
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String worda = scan.next();

		System.out.println(isPalindrome(worda));

	}

	public static boolean isPalindrome(String word) {
		
		String dummy = "";

		for (int i = word.length() - 1; i >= 0; i--) {

			dummy = dummy + word.charAt(i);
		}

		if (word.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			return true;
		} else {
			return false;
		}
	}

}
