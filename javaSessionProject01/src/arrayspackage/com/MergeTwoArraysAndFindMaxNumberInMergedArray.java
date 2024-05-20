package arrayspackage.com;

public class MergeTwoArraysAndFindMaxNumberInMergedArray {
	
	public static void main(String[] args) {
		
		int a[]= {2,5,9,7,6,8};
		int b[]= {1,3,4,40,20,65};
		
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		
		int c[]= new int[c1];
		
		
		
		for(int i=0;i<a.length;i++)
		{
			 c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a1+i]=b[i];
		}
		
		for(int i=0;i<c1;i++)
		{
			for(int j=i+1;j<c1;j++)
			{
				if(c[i]<c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			
			
			
			
		}System.out.println(c[0]);
		
		
	}

}
