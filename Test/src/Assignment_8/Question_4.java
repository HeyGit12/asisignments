package Assignment_8;

public class Question_4 {

	public static void main(String[] args) {
		
		
		printHollowRect(0, 0);
		
		
		

	}
	
	public static void printHollowRect(int a, int b) {
		a=5;
		b=5;
		for(int i=1;i<=a;i++) {  //rows
			
			
			for(int j=1;j<=b;j++) { //columns
				
				if(i==1||i==a||j==1||j==b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println(); //jump to new line
		}
		
			
	}
	
	
	
	

}
