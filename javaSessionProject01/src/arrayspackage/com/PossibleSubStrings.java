package arrayspackage.com;

public class PossibleSubStrings {
	
	public static void main(String[] args) {
		
		String word="NayazAhmad";
		for(int i=0;i<word.length();i++)
		{
		   for(int j=i+1;j<word.length();j++)
		   {
			   String substrings = word.substring(i, j);
			   System.out.println(substrings);
		   }
			
		}
	}

}
