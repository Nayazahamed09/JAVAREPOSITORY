package stringPackage.com;

import java.util.Scanner;

public class PanaGramNumber {

	public static void main(String[] args) {
		
		Scanner word=new Scanner(System.in);
		System.out.println("Enter the string:");
		String panagram = word.nextLine();
		String string = panagram.replaceAll(" ","").toLowerCase();
		boolean flag=false;
		
		for(char ch='a';ch<='z';ch++)
		{
			if(string.contains(string.valueOf(ch)))
			{
				flag=false;
				break;
				
			}
		}
		if(flag==true)
		{
			System.out.println("This is panagram");
		}
		

	}

}
