package stringPackage.com;

public class ReverseOfStringUsingRecurssion {
	
	public static void main(String[] args)
	{
		String s="NayazAhamed";
		rev(s,s.length()-1);
		
		
	}
	public static void rev(String word,int length)
	{
		if(length>=0)
		{
			System.out.print(word.charAt(length));
			length--;
			rev(word,length);
		}
	}
	
	
	

}
