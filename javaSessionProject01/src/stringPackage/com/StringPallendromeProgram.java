package stringPackage.com;

import java.util.Scanner;

public class StringPallendromeProgram 
{
	public static void main(String A) 
	{
		for(;;)
		{
			Scanner S=new Scanner(System.in);
			String ST=S.nextLine();
			String rev=" ";
			for(int i=ST.length()-1;i>=0;i++)
			{
				rev=rev+ST.charAt(i);
			}
			if(rev.equals(ST))
			{
				System.out.println("It is a pallendrome");
			}
			else
			{
				System.out.println("It is  not a pallendrome");
			}
		}
	 
		
	}

}
