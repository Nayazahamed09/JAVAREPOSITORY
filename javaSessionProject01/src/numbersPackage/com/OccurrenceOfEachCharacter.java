package numbersPackage.com;

public class OccurrenceOfEachCharacter 
{
	public static void main(String[] args) 
	{
		//String S="MALAYALAM";
		
		int a[]= {1,0,0,1,2,2,4};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
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
			   System.out.println(a[i]+ "------>" + count);
			}
		}
		
		
	}

}
