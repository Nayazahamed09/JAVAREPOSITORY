package stringPackage.com;

public class IncreasingTheLengthOfStringBygivingSpace {

	public static void main(String[] args) 
	{
		String s="tester"; // t e  s   t    e     r;
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
		}
		

	}

}
