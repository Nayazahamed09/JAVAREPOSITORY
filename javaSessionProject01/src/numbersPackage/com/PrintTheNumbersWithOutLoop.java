package numbersPackage.com;

public class PrintTheNumbersWithOutLoop {
	
	public static void main(String[] args)
	{
		printNumbers(1, 10);
		
		
	}
	public static void printNumbers(int n,int end)
	{
		if(n<=end)
		{
			System.out.println(n);
			printNumbers(n+1, end);
		}
		{
			
		}
	}

}
