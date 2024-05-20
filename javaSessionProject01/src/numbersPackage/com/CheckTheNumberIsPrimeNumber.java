package numbersPackage.com;

import java.util.Scanner;

public class CheckTheNumberIsPrimeNumber 
{
	public static void main(String[] args) 
	{
		
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int k = s.nextInt();
		 
		 if(k%2!=0 )
		 {
			 System.out.println("It is a prime number");
		 }
		 else
		 {
			 System.out.println("Not a prime number");
		 }
	}

}
