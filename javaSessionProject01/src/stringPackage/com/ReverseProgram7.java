 package stringPackage.com;

public class ReverseProgram7 {

	public static void main(String[] args) 
	
	{
		String s="Hi how r u ";
		//String s=" Hi Hello Welcome To"; // oT emocl eWolleH iH
		String s1=s.replaceAll(" ", "");
		int j=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(j--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		
		
		
		

	}

}
