package numbersPackage.com;

public class ReversingTheARRAYAndStoreInAnotherArray {

	
	public static void main(String[] args) {
		
		int a[]= {1,2,9,6,9,5,7};
		int[] d=new int[a.length];
		
		
		for(int i=a.length-1;i>=0;i--)
		{
			d[i]=a[i];
			System.out.print(d[i]+" ");
			
			
		}
		
	}
}
