package numbersPackage.com;

public class ProductOfFirstThreeMaxNumbersUsingBubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]= {4,6,7,9,8,2,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int prod=1;
		for(int i=0;i<3;i++)
		{
			prod=prod*a[i];
		}
		System.out.println(prod);
		
	}

}
