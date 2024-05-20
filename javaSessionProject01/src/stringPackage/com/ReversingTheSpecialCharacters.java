package stringPackage.com;

public class ReversingTheSpecialCharacters {

	public static void main(String[] args) 
	{
		String s="o9#sol^ut#io$n&s";//sn#oit^ul#os$9&o
		String s1=s.replace("[^0-9A-Za-z]", "");
		//String s1=09solutions
		int c=s1.length()-1;//10
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9'||s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				System.out.println(s1.charAt(c--));//sn#oit^ul#os$9&o
			}
			else
			{
				System.out.println(s.charAt(i));//#^#$&
			}
		}
				
		

	}

}
