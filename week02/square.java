package Week2;
import java.util.Scanner;

public class square {
	public static void main(String[] args){
		float length;
		float perimeter;
		float area;
		final float Pi = (float) 3.14;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value of length");
		length = scan.nextFloat();
		
		//calculate the perimeter
		perimeter = (float)(2*Pi*length);
		System.out.println("The perimeter of the circle is "+ perimeter);
		
		//calculate the area of the curcle
		
		area = (float)(Pi*length*length);
		System.out.println("The area of the cirlce is "+ area);
		
		
	}

}
