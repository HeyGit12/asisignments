package Assignment_8;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int numb1=scan.nextInt();
		
		
		sign(numb1);
		

	}
	
	public static void sign(int numb) {
	/*	Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		numb=scan.nextInt();
		*/
		
		if(numb==0) {
			System.out.println(0);
		}else if(numb>0) {
			System.out.println(1);
		}else {
			System.out.println(-1);
		}
	}
	

}
