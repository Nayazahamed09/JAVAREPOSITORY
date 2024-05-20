package pattrenPrograms.com;

public class AssignmentProgram3 
{
	public static void main(String[] args) 
	{
		int []a= {4,5,7,3,2};
		int []b= {2,3,4,1};
		//{6,8,11,4,2}
		//int [] sumArray=new int[a.length];
		/*for (int i=0;i<sumArray.length-1;i++)
		{
			sumArray[i]=a[i]+b[i];
			
		}
		for (int i : sumArray) 
		{
			System.out.println(i+ " ");
		}*/
		
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try
			{
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e)
			{
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}
			}
		}
		
	
		
		
		
	}

}
