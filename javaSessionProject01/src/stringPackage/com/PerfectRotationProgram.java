package stringPackage.com;

public class PerfectRotationProgram {

	public static void main(String[] args) 
	{
		String s="Hi Hello Welcome To";//Perfect Rotation
		
		//Hello Welcome To Hi
		//Welcome To Hi Hello
		//To Hi Hello Welcome
		//Hi Hello Welcome To
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String Temp=s1[0];
			for(int j=1;j<s1.length;j++)
			{
				s1[j-1]=s1[j];
				System.out.print(s1[j-1]+" ");
			}
			System.out.print(s1[s1.length-1]=Temp);
			System.out.println();
			
		}
		
		
		

	}
	

}
