package arrayspackage.com;

import java.util.Scanner;

public class SumOfUnbalancedArray {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size Of the Array:");
		int size=s.nextInt();
		System.out.println("Enter the Elements:");
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the Size of second Array:");
		int length=s.nextInt();
		System.out.println("Enter the elements in Second Array");
		int array[]=new int[length];
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		
		int newLength=size+length;
		
		int newArray[]=new int[newLength];
		
		for(int i=0;i<newLength;i++)
		{
			int num1=i<arr.length ? arr[i]:0;
			int num2=i<array.length ? array[i]:0;
			newArray[i]=num1+num2;
		}
		System.out.println("Sum of the Array:");
		for(int num:newArray)
		{
			System.out.println(num+" ");
		}
			
		
		
		
		
		
		
	}

}
