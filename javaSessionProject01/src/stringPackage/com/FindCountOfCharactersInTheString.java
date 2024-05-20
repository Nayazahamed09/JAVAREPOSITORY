package stringPackage.com;

public class FindCountOfCharactersInTheString {

	public static void main(String[] args) {
		
		String S ="Test Yantra";
		int count =0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
		execute();
		initiate();
		mirrorString();
		orderChangeInString();


	}
	
	public static void execute()
	{
		//String s="Test45ya756nt2ra1234";
		String s="1234 2 756 45";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void initiate()
	{
		String s="Test45ya756nt2ra1234";
		String[]st=s.split("[^0-9]");
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print (st[i]+ " ");
		}
		
	}
	
	public static void mirrorString()
	{
		String s="Hi Hello Welcome"; //emoleW olleH iH
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
	
	public static void orderChangeInString()
	{
		String s="Hi Hello Welcome"; // Welcome Hello Hi;
		String[] K=s.split(" ");
		for(int i=K.length-1;i>=0;i--)
		{
			System.out.print(K[i]+" ");
		}
	}

}

