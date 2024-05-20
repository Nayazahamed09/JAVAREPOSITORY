package camelCaseCharacters.com;

public class ReverseTheLastWord {

	public static void main(String[] args) {
		
		
		String word="SubhamSuna"; // NayazdamhA // zayaNAhmad // zayaNdamhA
		int last=word.length()-1;
		
		for(int i=0;i<word.length();i++)
		{
			if(i<word.length()/2)
			{
				System.out.print(word.charAt(i));
			}
			if(i>=word.length()/2)
			{
				System.out.print(word.charAt(last--));
				
			}
				
			
		}

	}

}
