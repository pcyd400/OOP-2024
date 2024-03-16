package Week2;
import java.util.Scanner;

public class converter {
	
	public static void main(String[] args) {
		float miles;
		float kilometer;
		
		Scanner scan = new Scanner(System.in);
		
		//take the input from the user in miles
		
		System.out.println("Enter the miles: ");
		miles = scan.nextFloat();
		
		//convert the miles into kilometers
		
		kilometer = (float) (miles*1.60935);
		
		System.out.println("the result is "+kilometer+"Km");
		
	}
	

}
