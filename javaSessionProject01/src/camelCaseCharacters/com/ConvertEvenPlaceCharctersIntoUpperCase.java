package camelCaseCharacters.com;

public class ConvertEvenPlaceCharctersIntoUpperCase {
	
	public static void main(String[] args) {
		
		String word="nayazahamed";
		
		for (int i=0;i<word.length();i++) 
		{
			
			if(i%2==1)
			{
				char ch = Character.toUpperCase(word.charAt(i));
				System.out.print(ch);
				
				
			}
			else
			{
				System.out.print(word.charAt(i));
			}
			
			
			
				
		}
	}

}
