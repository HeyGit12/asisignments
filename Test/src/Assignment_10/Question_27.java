package Assignment_10;

public class Question_27 {

	public static void main(String[] args) {

		/*
		 * coverString method will take 2 string parameters from the caller.
		 * 
		 * Your job is to write an important code that will :
		 * 
		 * - to search and find each appearance of coverME within main - then surround
		 * it with [coverMe] (square brackets) - if you cannot find the coverME within
		 * main after tirelessly looping then just return whole main itself covered
		 * [main]. - keep in mind that coverME value can be of any length.
		 */

		coverString("apples", "pears");

	}

	public static void coverString(String word1, String word2) {

		if (word1.contains(word2)) {
			String cover = word1.replace(word2, "[" + word2 + "]");
			System.out.println(cover);
		} else {
			System.out.println("[" + word1 + "]");
		}
	}
}