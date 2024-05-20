package camelCaseCharacters.com;

public class ReverseTheCharacters {

	public static void main(String[] args) {
		
		String x= "Hi Hello How Are You";
		String y[]=x.split(" ");
		
		for(int i=0;i<y.length;i++)
		{
			String g = y[i];
			for(int j=g.length()-1;j>=0;j--)
			{
				System.out.print(g.charAt(j));
			}
			System.out.print(" ");
			
			
		}
		
		

	}

}
