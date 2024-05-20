package numbersPackage.com;

public class PrintMissingNumbers {

	public static void main(String[] args) {
		
		int a[]= {10,16,25,40,50};
		int start=a[0];
		int end=a[a.length-1];
		
		for(int i=start;i<end;i++)
		{
			boolean found=false;
			
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					found=true;
					break;
				}
				
			}
			if(!found)
			{
				System.out.println(i);
			}
			
			
		}

	}

}
