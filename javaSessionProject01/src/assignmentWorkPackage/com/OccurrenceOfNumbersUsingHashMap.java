package assignmentWorkPackage.com;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class OccurrenceOfNumbersUsingHashMap {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,9,9,8,7,6,9};
		
		HashMap<Integer, Integer>map= new HashMap<Integer, Integer>();
		
		for(int number:a)
		{
			if(map.containsKey(number))
			{
				map.put(number, map.get(number)+1);
				
			}
			else
			{
				map.put(number, 1);
			}
		}
		for(java.util.Map.Entry<Integer, Integer> Number :map.entrySet())
			
		{
			
			if(Number.getValue()>1)
			{
				System.out.println(Number.getKey()+" "+Number.getValue());
			}
		}
	}

}
