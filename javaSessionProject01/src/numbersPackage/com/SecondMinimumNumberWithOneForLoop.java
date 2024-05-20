package numbersPackage.com;

public class SecondMinimumNumberWithOneForLoop {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,7,2,1,5,4};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=a[i];
			}
			else if(smin==fmin||smin>a[i])
			{
				smin=a[i];
				
			}
			
		}
		System.out.println(fmin);
		 System.out.println(smin);
		

	}
	 
	

}
