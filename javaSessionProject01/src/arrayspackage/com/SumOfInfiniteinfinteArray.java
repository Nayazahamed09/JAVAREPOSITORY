package arrayspackage.com;

import java.util.Scanner;

public class SumOfInfiniteinfinteArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements: ");
		int []a=new int[size];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum=sum+ a[i];
		}
		
		System.out.println("The sum is: "+sum);
	}

}
