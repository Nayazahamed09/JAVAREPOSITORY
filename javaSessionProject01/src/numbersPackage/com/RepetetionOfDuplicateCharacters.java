package numbersPackage.com;

public class RepetetionOfDuplicateCharacters {

	public static void main(String[] args) 
	{
		String S="MALAYALAM";
		for(int i=0;i<S.length();i++)
		{
			int count=0;
			for(int j=0;j<S.length();j++)
			{
				if(S.charAt(i)==S.charAt(j))
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count>1)
			{
			   System.out.println(S.charAt(i)+ "------>" + count);
			}
		}
		
		
	}
	

	}


