package Assignment_8;
import java.util.*;
public class Question_10 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int newNum=scan.nextInt() ;
		
		System.out.println(isEven(newNum));

	}
	
	public static boolean isEven(int numb) {
		if(numb%2==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
