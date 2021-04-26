package Assignment_8;

public class Question_15 {

	public static void main(String[] args) {
		
	
	
		
		
		System.out.println(validateTask(true, 4, 3));
		
		
	
	
	
	}
	
	public static boolean validateTask(boolean check, int taskID, int currentID) {
		
		if(check==true&&taskID==currentID+1) {
			return true;
		}else if(taskID>=10) {
			return false;
		}else {
			return false;
		}
			
		
		
		
	}
	
	
	
}
