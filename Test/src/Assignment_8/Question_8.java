package Assignment_8;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int sequenced=scan.nextInt();
		fib(sequenced);
		
	} 
	public static void fib(int numb) {
		
		int temp1=0, temp2=1;
		for(int i=2;i<numb;i++) {        //starting from 2 since 0 and 1 are already declared
			
			int cache=temp1+temp2;
			temp1=temp2;
			temp2=cache;
			//System.out.print(temp2 + " ");
		}
		
		
		System.out.println(temp2);
		
		

		
		
	}

}
