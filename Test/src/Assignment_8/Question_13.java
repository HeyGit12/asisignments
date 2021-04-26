package Assignment_8;
import java.util.*;
public class Question_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double input=scan.nextDouble();
		
		waterTax(input);
		
		
	}
	
	public static void waterTax(double units) {
		double bill=0;
		if(units<=50) {
			bill=units*0.60;
			System.out.println(bill);
			
		}else if(units>50&&units<=100) {
			bill=units*0.90;
			System.out.println(bill);
		}else if(units>100&&units<150) {
			bill=(units*0.90)+50;
			System.out.println(bill);
		}else if(units>=150){
			bill=(units*0.90)+100;
			System.out.println(bill);
		}
		
	}
	
	

}
