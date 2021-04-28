package Assignment_10;
import java.util.*;
public class Question_20 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter your number: ");
		int numb=scan.nextInt();
		
		int result=numb;
		
		for(int i=1;i<numb;i++) {
			result*=i;
		}
		
		
		System.out.println(result);
		
		
		
		
	}
	
	
	
}
