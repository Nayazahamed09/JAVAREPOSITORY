package rakutenPackage.com;

import java.util.ArrayList;
import java.util.List;

public class OccuranceOfLetterI {
	
	public static void main(String[] args) {
		
		String input="This is from india";  // i---->4;
		String newInput=input.replace(" ", "");
		
		//List<String>set=new ArrayList<String>();
		
		//set.add(newInput);
		int count=0;
		
		for(int i=0;i<newInput.length();i++)
		{
			
			
			if(newInput.charAt(i)=='i')
			{
				count++;
				if(count>3)
				{
					System.out.println(newInput.charAt(i)+ " "+count);
				}
				
			}
			
			
		}
		
		
	}

}
