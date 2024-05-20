package collectionsPackage.com;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetProgram {
	
	public static void main(String[] args) {
		
	String S="ABCABC";//	ABC
	
		TreeMap<Character, Integer>map= new TreeMap<Character, Integer>();
		
		for(int i=0;i<S.length();i++)
		{
			if(map.containsKey(S.charAt(i)))
			{
				map.put(S.charAt(i), map.get(S.charAt(i))+1);
				
			}
			else
			{
				map.put(S.charAt(i), 1);
			}
			for(java.util.Map.Entry<Character, Integer> m:map.entrySet())
			{
				if(m.getValue()>1)
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
			}
		}
		
					  

}
}
