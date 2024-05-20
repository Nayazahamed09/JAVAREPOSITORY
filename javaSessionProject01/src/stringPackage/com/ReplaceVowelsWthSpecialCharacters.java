package stringPackage.com;

public class ReplaceVowelsWthSpecialCharacters {

	
	public static void main(String[] args)
	{
		String S= "Nayazahamed";
		String K = S.toLowerCase();
		String M = K.replaceAll("[aeiou]","@");
		System.out.println(M);	
		getMirrorMethod();
//		inititaeMethod();
		
	}
	
	public static void inititaeMethod()
	{
		String A="A2B2C1D2E4"; //AABBCDD;
		
		for(int i=0;i<A.length();i++)
		{
			if(Character.isAlphabetic(A.charAt(i)))
			{
				System.out.print(A.charAt(i));
			}
			else
			{
				int x= Character.getNumericValue(A.charAt(i));
				for(int j=1;j<x;j++)
				{
					System.out.print(A.charAt(i-1));
				}
				
			}
		}
		
	}
	
	public static void getMirrorMethod()
	{
		String A="HI HELLO WELCOME JAVA Subham"; // JAVA HELLO WELCOME HI;
		
		String spl[]=A.split(" ");
		int l=spl.length-1;

		for(int i=0;i<spl.length;i++) {
			if(i==0) {
				System.out.println(spl[l]);
			}
			else if(i==l ) {
				System.out.println(spl[0]);
			}
			else {
				System.out.println(spl[i]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
