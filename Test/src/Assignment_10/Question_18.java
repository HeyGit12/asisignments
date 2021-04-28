package Assignment_10;
import java.util.*;
public class Question_18 {

	public static void main(String[] args) {
		
		
		
		
		
		
		System.out.println(returnWord("World", "X", 1));
		
	
	}
	public static String returnWord(String word1, String word2, int input) {
		String dummy=word1;
		Scanner scan = new Scanner (System.in);
		System.out.println("enter da first word: ");
		word1=scan.next();
		System.out.println("enter da second word: ");
		word2=scan.next();
		System.out.println("How many times?");
		input=scan.nextInt();
		
		for(int i=1;i<input;i++) {
			dummy=dummy+ word2+ word1;
			
		}
		
		return dummy;
		
		
		
	}
	
	
	
	
	
}
