package stringPackage.com;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;

public class PositionOfLettersInString {
	
	public static void main(String[] args) 
	{
		String s="NayazAhmad";
	       LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
	       for(int i=0;i<s.length();i++)
	       {
	           map.put(s.charAt(i),1);
	           
	       }
	       for(Entry<Character,Integer>set:map.entrySet())
	       {
	           for(int i=0;i<s.length();i++)
	           {
	               if(set.getKey()==s.charAt(i))
	               {
	                   System.out.println(set.getKey()+" position is "+(i+1));
	               }
	           }
	       }
		
	}

}
