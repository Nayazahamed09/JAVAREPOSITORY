package stringPackage.com;

public class SubstringProgram {
	
	public static void main(String[] args) {
		
		String word= "nayazahamed";
		
		for(int i=0;i<word.length();i++)
		{
			String substring = word.substring(i);
			if(substring.length()>=7)
			{
				System.out.println(substring);
			}
		}
		
	}

}
