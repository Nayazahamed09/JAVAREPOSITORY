package stringPackage.com;

public class SeggregationOfSpecialCharactersInTheOrder {

	public static void main(String[] args) 
	{
		String S="a^2c&d4"; //acd 24 ^&
		String Alpha="";
		String num=" ";
		String spc=" ";
		for(int i=0;i<S.length();i++)
		{
			char ch=S.charAt(i);
			if(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')
			{
				Alpha=Alpha+ch;
			}
			else if(ch>='0'&& ch<='9')
			{
				num=num+ch;
			}
			else
			{
				spc=spc+ch;
			}
		}
		System.out.println(Alpha+num+spc);
		

	}

}
