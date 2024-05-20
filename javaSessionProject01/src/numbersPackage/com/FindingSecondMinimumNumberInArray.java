package numbersPackage.com;

import java.util.Scanner;

public class FindingSecondMinimumNumberInArray 
{
	public static void main(String[]args)
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Size of  an  Array");
		int n[]= new int[S.nextInt()];
		for(int i=0;i<n.length;i++)
		{
			System.out.println("Enter the value in  an  Array"+(i+1));
			n[i]=S.nextInt();
			
		}
		//int n[]= {45,64,102,56,116,99,17,25};//
		int max=n[0];
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		System.out.println(max);
		int mini=max;
		int secmini=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]<mini)
			{
				secmini=mini;
				mini=n[i];
			}
			else if(n[i]!=secmini  && n[i]!=mini)
			{
				secmini=n[i];
			}
		}
		System.out.println(secmini);
	}

}
