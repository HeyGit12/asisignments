package Lab1;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charge for the meal:");
		double charge=sc.nextDouble();
		
		double tax=6.75;
		double taxed=charge/100*tax;
		double tip=(int)((charge+taxed)*0.20);
		double bill=(int)(charge+taxed+tip);
		
		System.out.println("The charge for meal is: $" + charge +" tax amount is: $" + taxed + " tip amount is: $"  + tip +" total bill is:" + bill);
		
		
			
		
		
		
	}

}
