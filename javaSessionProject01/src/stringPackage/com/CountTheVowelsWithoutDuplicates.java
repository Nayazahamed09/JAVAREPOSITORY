package stringPackage.com;

import java.util.LinkedHashSet;

public class CountTheVowelsWithoutDuplicates {

	public static void main(String[] args) {
		
		String S="HIMALAYAS";
		String S1=S.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<S1.length();i++)
		{
			set.add(S1.charAt(i));
		}
		int count=0;
		for (Character ch : set) 
		{
			if((ch=='a')||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
				count++;
				System.out.print(ch+" ");
			}
			
			
		}
		System.out.print(count);
		
		

	}

}
