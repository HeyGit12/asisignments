package Assignment_10;

import java.util.*;

public class Question_16 {

	public static void main(String[] args) {

		String str = "xjavaxx";

		boolean flag = true;

		for (int i = 0; i < 2; i++) {

			if (str.substring(i, i + 4).equals("java")) {

				flag = true;
				break;

			} else {

				flag = false;
			}

		}

		if (flag) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
