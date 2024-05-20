package stringPackage.com;

public class AddNumbersInTheString 
{
	public static void main(String[] args) 
	{
		String S="a10@b20%5";
		int sum=0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)>='0'&& S.charAt(i)<='9')
			{
				int n=S.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
		//execute();

		
	}
	
	public static void execute()
	{
		String s="a1b2c3";
		char[] s1=s.toCharArray();
		System.out.println(s1);
		
			}

}
