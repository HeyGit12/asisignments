package Assignment_8;

public class Question_14 {

	public static void main(String[] args) {
		
		System.out.println(threeLocks(true, true, true));
		
		
		

	}
	
	public static boolean threeLocks(boolean bol1, boolean bol2, boolean bol3) {
		return (bol1&bol2)&bol3;
	}

	
}
