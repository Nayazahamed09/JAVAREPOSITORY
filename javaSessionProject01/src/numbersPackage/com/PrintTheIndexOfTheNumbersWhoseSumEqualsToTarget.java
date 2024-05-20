package numbersPackage.com;

public class PrintTheIndexOfTheNumbersWhoseSumEqualsToTarget {
	
	public static void main(String[] args) {
		
		
		int arr[]= {2,4,6,7,3,5,9,1,2,6};
		
		int targetNumber=11;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				if(sum==targetNumber)
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}

}
