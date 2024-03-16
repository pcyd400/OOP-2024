package Week2;

//*******************************************************************
//Average.java
//
//Read three integers from the user and print their average
//*******************************************************************


import java.util.Scanner;

public class Average
{
public static void main(String[] args)
{
  int val1, val2, val3;
  double average;
  Scanner Scan = new Scanner(System.in);
  //get three values from user
  System.out.println("Please enter the integers and"+"I will compute their average");
  
  System.out.println("Enter the first value: ");
  val1 = Scan.nextInt();
  
  System.out.println("Enter the second value");
  val2 = Scan.nextInt();
  
  System.out.println("Enter the third value: ");
  val3 = Scan.nextInt();
  

  //compute the average
  
  average = (double)(val1+val2+val3)/3;
  
  
  
  //print the average
  
  System.out.printf("The average is:"+average);
  
  
  
  
  
  
}
}
