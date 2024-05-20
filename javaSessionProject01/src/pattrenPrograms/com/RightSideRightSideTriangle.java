package pattrenPrograms.com;

public class RightSideRightSideTriangle {

	public static void main(String[] args) {
		
		/*int n=5;
		 for (int i = 0; i < n; i++) {
	            // Print spaces
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 0; k <= i; k++) {
	                System.out.print("* ");
	            }
	            // Move to the next line
	            System.out.println();*/
	            nextPattren();

	}
	
	
	public static void nextPattren()
	{
		int n=5;
		
		for(int i=0;i<=n;i++)
		{
			for(int j=i;j<=n;j--)
				System.out.print("* ");
		}
		System.out.println(" ");
		
	}

}
