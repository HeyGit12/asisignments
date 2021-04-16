package Lab1;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double amount=sc.nextDouble();
		
		
		
		double stateTax=(int)amount/100*4;
		double countyTax=(int)amount/100*2;
		double totalTax=stateTax+countyTax;
		double totalPur=(int)(stateTax+countyTax+amount);
		
		System.out.println("The amount of your purchase is: $" + amount + " the state tax is $" + stateTax + " the county tax is $" + countyTax + " the total tax is $" + totalTax + " the total purchase is $" + totalPur );
		
		
		
		
		

	}

}
