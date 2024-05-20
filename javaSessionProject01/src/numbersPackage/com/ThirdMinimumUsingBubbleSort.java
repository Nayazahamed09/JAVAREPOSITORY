package numbersPackage.com;

public class ThirdMinimumUsingBubbleSort {

	
	public static void main(String[] args) {
		
		int a[]= {7,9,6,5,9,7,2,4};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(a[2]);
		
	}
}
