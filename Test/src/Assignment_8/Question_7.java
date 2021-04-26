package Assignment_8;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(false));
		
		
	}
	
	public static boolean isPalindrome(boolean pal) {
		 
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your number: ");
		int numb=scan.nextInt();
		
		
		int reminder;
		int summary=0;
		int temp=numb;
		
		while(numb>0){
			reminder= numb % 10;
			summary= (summary*10) + reminder;
			numb= numb/10;
			}
		if(temp==summary) {
			return pal=true;
		}else {
			return pal=false;
		}
		
		
		
	}
	
	
}
