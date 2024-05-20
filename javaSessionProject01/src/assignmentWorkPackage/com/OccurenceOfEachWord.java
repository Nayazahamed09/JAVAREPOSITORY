package assignmentWorkPackage.com;

public class OccurenceOfEachWord {

	public static void main(String[] args) 
	{
		String S="HI HELLO HI HELLO WELCOME";
		//String Word="";
		String[] S1=S.split(" ");
		int count;
		for(int i=0;i<S1.length;i++)
		{
			count=0;
			for(int j=0;j<S1.length;j++)
			{
				if(S1[i]==S1[j])
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.println(S1[i]+"------>"+count);
			}
				
		}
		
	}

}
