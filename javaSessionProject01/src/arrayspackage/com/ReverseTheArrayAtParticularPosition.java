package arrayspackage.com;

import java.util.Scanner;

public class ReverseTheArrayAtParticularPosition {

	public static void main(String[] args) {
	  
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Position of Length : ");
		int position=s.nextInt();
		
		for(int i=position-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		for(int i=position;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
