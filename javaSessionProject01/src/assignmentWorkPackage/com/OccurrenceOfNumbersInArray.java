package assignmentWorkPackage.com;

public class OccurrenceOfNumbersInArray 
{
	public static void main(String[] args) 
	{
		int[]a= {4,5,6,6,7,8};
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
				System.out.println(a[i]+"------> "+ count);
			}
		}
		
	}

}
