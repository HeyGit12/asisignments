package Assignment_8;
import java.util.Scanner;
public class Question_6 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your number:");
		int num=scan.nextInt();
		
		next3(num);
		

	
	}
	
	public static void next3(int numb1) {
		
		System.out.print("next 3 are: ");
		
		for(int i=1;i<4;i++) {
			
			System.out.print(numb1 + i + " " );
		
			/* int numb2=numb1+1;
		int numb3=numb2+1;
		int numb4=numb3+1;
		
		System.out.println("next 3 are: " + numb2 + " " + numb3 + " " + numb4);
		*/
		
		
		}
		
		
	}
	

}
