package Assignment_10;

public class Question_28 {

	public static void main(String[] args) {
		
		
		
		
		System.out.println(clean("one two three", "two"));
		
		
		

	}

	public static String clean(String text, String badWord) {
		
		

		for (int i = 0; i <= text.length()-badWord.length(); i++) {

			if ((text.substring(i, i + badWord.length())).equals(badWord)) {

				text = text.replace(badWord, "");
				
				
				text = text.replace("  ", " ");

			}

		}
		return text;

	}

}