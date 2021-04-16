package Lab1;

import java.util.*;

public class Question_1 {

	public static void main(String[] args) {

		int Snum, Lnum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int userInput = scan.nextInt();
		Snum = userInput;
		Lnum = userInput;
		System.out.print("Enter your next number:");
		int userInput2 = scan.nextInt();
		if (Snum < userInput2) {
			Snum = userInput2;
		} else if (Lnum > userInput2) {
			Lnum = userInput2;
		}

		do {
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			int userInput3 = scan.nextInt();

			if (userInput3 == 1) {
				System.out.print("Enter your next number:");
				int userInput4 = scan.nextInt();
				if (Snum > userInput4) {
					Snum = userInput4;
				} else if (Lnum < userInput4) {
					Lnum = userInput4;
				}

			} else {
				if (userInput3 == 0) {

					System.out.println("Smallest Number is:" + Snum);
					System.out.println("Largest Number is:" + Lnum);
					break;
				}

			}

		} while (true);

	}

}
