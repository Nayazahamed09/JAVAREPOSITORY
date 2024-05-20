package arrayspackage.com;

import java.util.*;

public class BalancedString {

	public static void main(String[] args) {
		String data="{[()]}";
		
		// 1 step: Create Array List 
		
		
		ArrayList<Character>list= new ArrayList<Character>();
		for(int i=0;i<data.length();i++)
		{
			if((list.size()!=0)&&(data.charAt(i)==')'&& list.get(list.size()-1)=='(')
					||(data.charAt(i)==']'&& list.get(list.size()-1)=='[')
					||(data.charAt(i)=='}'&& list.get(list.size()-1)=='{'))
			{
				list.remove(list.size()-1);
			}
			else
			{
				list.add(data.charAt(i));
			}
			
		}
		if(list.size()==0)
		{
			System.out.println("The String is Balanced");
		}
		else
		{
			System.out.println("The String is Not Balanced");
		}
		
		

	}

}
