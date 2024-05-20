package arrayspackage.com;

public class ReverseTheString {

	public static void main(String[] args) {
		
        String s="ChandraBabuNaidu";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
            //System.out.println(rev);
            
        }
        System.out.println(rev);
        reverseMethod();
        
	}
	
	public static void reverseMethod()
	{
		String s="ChandraBabuNaidu";
		char[] letter = s.toCharArray();
		for(int i=0;i<letter.length-1;i++)
		{
			
		}
		
	}
}
