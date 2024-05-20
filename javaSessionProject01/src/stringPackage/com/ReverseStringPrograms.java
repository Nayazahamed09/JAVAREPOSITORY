package stringPackage.com;

public class ReverseStringPrograms 
{
	public static void main(String[] args) 
	{
		String s="i am Selenium";
		
		
		//String s="Hi Hello Welcome"; // iH olleH emocleW
		String[] k=s.split(" ");
		for(int i=0;i<k.length;i++)
		{
			
			String st=k[i];
			for(int j=st.length()-1;j>=0;j--)
			{
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
