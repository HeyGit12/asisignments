package Assignment_10;

public class Question_30 {

	public static void main(String[] args) {

			at3("longword","foo");
		
		
	}
	
	public static void at3(String word1, String word2) {
		
		String str = word1.substring(0, 3)+word2+word1.substring(3, word1.length());
		
		System.out.println(str);

	}

}
