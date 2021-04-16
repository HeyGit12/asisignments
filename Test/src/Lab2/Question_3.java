package Lab1;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sumOfNums = 0;
		System.out.println("Enter your numbers: ");
		while (true) {
			int num = sc.nextInt();
			if (num <= 0)
				break;
			sumOfNums += num;
		}

		System.out.println("Sum of entered numbers is: " + sumOfNums);

	}

}
