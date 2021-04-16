package Lab1;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

		int bagCookies = 40, servingCooking = 10, caloriesTotal = 300;
		double oneServeCals = (bagCookies / servingCooking);
		double oneCookyCals = (caloriesTotal / servingCooking) / (oneServeCals);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter consumed cookies:");
		int conCookies = sc.nextInt();
		double consumedCals = oneCookyCals * conCookies;
		System.out.println("You have consumed " + consumedCals + " calories.");

	}

}
