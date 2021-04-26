package Assignment_8;

public class Question_16 {

	public static void main(String[] args) {
		
		
		
		System.out.println(simpleRoomBook(true, 7, 2, 2018));
		
	
	
	
	
	}
	
	public static boolean simpleRoomBook(boolean check, int day, int month, int year) {
		
		if(!(day>=7&&day<=31&&month>=1&&month<=8&&year==2018)&&check==true) {
			return true;
			
		}else  {
			return false;
		}
		
		
	}
	
	
	
	
}
