package stringPackage.com;

public class ProgramToPrintMinLengthValues {

	public static void main(String[] args) // a e
	{
		//String[] s= {"a","ab","abcd","e","abcde","de"}; 
		String s1[]={"1","12","1234","5","35346"};
		String Min_Length=s1[0];
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()<Min_Length.length())
			{
				Min_Length=s1[i];
			}
		
		}
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()==Min_Length.length())
			{
				System.out.print(s1[i]+ " ");
			}
		}
		
		
		

	}

}
