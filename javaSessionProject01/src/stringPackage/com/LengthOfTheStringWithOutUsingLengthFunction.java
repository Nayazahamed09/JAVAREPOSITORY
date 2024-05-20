package stringPackage.com;

import java.util.LinkedHashSet;

public class LengthOfTheStringWithOutUsingLengthFunction 
{
	public static void main(String[] args) 
	{
		String S="TestYantra";
		char[]c=S.toCharArray();
		int count=0;
		
		for (Character ch : c) 
		{
			count++;
			System.out.println(ch+" "+count);
		}
		
		
	}

}
