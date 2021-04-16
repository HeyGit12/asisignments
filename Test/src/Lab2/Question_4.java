package Lab1;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter females number: ");
		int femaleNumb=sc.nextInt();
		System.out.print("Enter males number: ");
		int maleNumb=sc.nextInt();
		
	int total=maleNumb+femaleNumb;
		double malePer=(double)maleNumb/total*100;
		double femalePer=(double)femaleNumb/total*100;
		System.out.println("The percentage of males is " + malePer + "% and " + "females is " + femalePer + "%");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
