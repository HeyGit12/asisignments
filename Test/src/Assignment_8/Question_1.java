package Assignment_8;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		
			plus(0,0);
		
		

	}
	public static void plus(int numb1, int numb2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number: ");
		numb1=scan.nextInt();
		System.out.println("enter second number: ");
		numb2=scan.nextInt();
		int result = numb1 + numb2;
		System.out.println("result: " + result );
	}

}
