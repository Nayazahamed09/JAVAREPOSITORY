package numbersPackage.com;

public class FindFirstMaxNumberUsingBubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]= {4,0,1,2,5};
		   
		   for(int i=0; i<a.length;i++)
		   {
			   for(int j=i+1; j<a.length;j++)
			   {
				   if(a[i]<a[j])
				   {
					   int temp=a[i];
					   a[i]=a[j];
					   a[j]=temp;
				   }
			   }
			   
	}
		   System.out.println("First max number is ---->" +a[0]);
		   
	

}
}
