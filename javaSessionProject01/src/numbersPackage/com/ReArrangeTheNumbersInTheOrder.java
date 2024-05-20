package numbersPackage.com;

public class ReArrangeTheNumbersInTheOrder {
	
	public static void main(String[] args) {
		
		
		int array[]= {2,7,6,7,0,0,0,9,6,5,1};//  {1,5,7,9,2,6,0}
		int Array[]= new int[array.length];
		int m=0; int n=array.length-1;
		for(int i=0;i<array.length;i++)
		{
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					if(i<j)
					{
						break;
					}
					else
					{
						count++;
					}
					
				}
				
				
				
									
			}
			System.out.println(array[i]);
			
		}
	}

}
