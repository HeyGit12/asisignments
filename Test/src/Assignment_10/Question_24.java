package Assignment_10;

public class Question_24 {

	public static void main(String[] args) {

		System.out.println(appearances("We study java not python"));

	}

	public static boolean appearances(String str) {

		int javaCount = 0, pythonCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (i < str.length() - 3) {

				String word = str.substring(i, i + 4);
				if (word.equals("java"))
					javaCount++;
			}
			if (i < str.length() - 5) {

				String word2 = str.substring(i, i + 6);
				if (word2.equals("python"))
					pythonCount++;
			}
		}
		if(javaCount == pythonCount) {
			return true;	
		}else {

			return false;
		}
			
		
	}
}
