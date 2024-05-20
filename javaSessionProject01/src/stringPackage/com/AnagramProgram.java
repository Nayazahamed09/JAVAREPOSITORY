package stringPackage.com;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram 
{
	public static void main(String[] args) 
	{
		for(;;)
		{
			Scanner S=new Scanner(System.in);
			System.out.println("THE STRING IS");
			String S1=S.next();
			
			Scanner Sc=new Scanner(System.in);System.out.println("THE SECOND ONE IS");
			
			
			String S2=Sc.next();
			
			char []a1=S1.toCharArray();
			char []a2=S2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			if(Arrays.equals(a1, a2))
			{
				System.out.println("it is anagram");
			}
			else
			{
				System.out.println("it is  not anagram");
			}

			
		}
		
	}

}
