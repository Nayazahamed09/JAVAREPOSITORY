package numbersPackage.com;

public class FirstMinNumberWithoutUsingBubbleSort 
{
	public static void main(String[] args) 
	{
		 int a[]= {4,9,1,2};
		int Fmin=a[0];
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<Fmin)
			{
				Fmin=a[i];
			}
						
		}
		System.out.println(Fmin);		
		
		
		
		 
}

}
