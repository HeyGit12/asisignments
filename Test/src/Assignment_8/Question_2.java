package Assignment_8;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		cube(0);
		
		

	}
	
	public static void cube(int numb) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		numb=scan.nextInt();
		
		int cube=numb*numb*numb;
		System.out.println("Result: " + cube);
	}
	
	

}
