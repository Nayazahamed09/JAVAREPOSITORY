package arrayspackage.com;

import java.util.Scanner;

public class PrintTheSumOfNumbersInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String value :");
        String number=sc.nextLine();
        int sum=0;
        
        for(int i=0;i<number.length();i++)
        {
            int digit=number.charAt(i)-'0';
            sum=sum+digit;
        }
        System.out.println("The sum is"+ " "+sum);

	}

}
