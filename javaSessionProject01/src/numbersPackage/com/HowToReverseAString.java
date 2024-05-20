package numbersPackage.com;

public class HowToReverseAString {

	public static void main(String[] args) 
	{
		String City="BANGALORE";
		
		for(int i=City.length()-1;i>=0;i--)
		{
			System.out.println(City.charAt(i));
		}
		initiate();
		execute();
		reverseMethod();


	}
	
	public static void initiate()
	{
		String s="Ananthapur";
		char[]st=s.toCharArray();
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.println(st[i]);
		}
	}
	
	public  static void execute()
	{
		String S="Hyderabad";
		String rev="";
		for(int i=S.length()-1;i>=0;i--)
		{
			rev=rev+S.charAt(i);
		}
		System.out.println(rev);
		
		
	}
	
	public static void reverseMethod()
	{
		String S="Chennai";
		StringBuilder Sb= new StringBuilder(S);
		StringBuilder a = Sb.reverse();
		System.out.println(a);
	}

}
