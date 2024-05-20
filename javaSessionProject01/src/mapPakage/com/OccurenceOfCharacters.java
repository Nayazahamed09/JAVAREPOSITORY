package mapPakage.com;

import java.util.HashMap;
import java.util.Map.Entry;
  
public class OccurenceOfCharacters 
{
	public static void main(String[] args) 
	
	{
		String M="india";
		
		
		
		//String S="MALAYALAM";
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		for(int i=0;i<M.length();i++)
		{
			if(map.containsKey(M.charAt(i)))
			{
				map.put(M.charAt(i), map.get(M.charAt(i))+1);
			}else
			{
				map.put(M.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer>m:map.entrySet())
		{
			if(m.getValue()>=1)
			{
				System.out.println(m.getKey()+ " "+m.getValue());
			}
		}
		
	}

}
