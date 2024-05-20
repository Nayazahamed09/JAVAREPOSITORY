package assignmentWorkPackage.com;

import java.util.HashMap;

public class OccurenceOfEachWordUsingHashMap 
{
	public static void main(String[] args) 
	{
		String S ="HELLO WORLD HELLO EVERYONE HOW ARE YOU";
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		String[] s=S.split(" ");
		for(String Word:s)
		{
			Integer integer=map.get(Word);
			if(integer==null)
				
			{
				map.put(Word,1);
				
			}
			else
			{
				map.put(Word, integer+1);
			}
			System.out.println(integer);
			
		}
		System.out.println(map);
		 
		
	}

}
