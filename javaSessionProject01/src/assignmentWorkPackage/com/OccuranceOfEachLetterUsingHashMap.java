 package assignmentWorkPackage.com;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class OccuranceOfEachLetterUsingHashMap {
	
	public static void main(String[]args)
	{
		String S="ABCABCABC"; //ABC
		
		LinkedHashMap<Character, Integer>map= new LinkedHashMap<Character, Integer>();
		
		char characters[]=S.toCharArray();
		
		for(int i=0;i<characters.length;i++)
		{
			if(map.containsKey(characters[i]))
			{
				map.put(characters[i], map.get(characters[i])+1);
				
			}
			else
			{
				map.put(characters[i], 1);
			}
			
		}
		for(java.util.Map.Entry<Character, Integer> Word:map.entrySet())
		{
			//System.out.println(Word.getKey());
			
			if(Word.getKey()>=1)
			{
				System.out.println(Word.getKey());
			}
		}
	}

}
