 package stringPackage.com;

public class OccurencesOfCharactersInString {

	public static void main(String[] args) {
		
		String S="aabbcabcc";
		//String S= "India";
		int count=1;
		for(int i=0;i<S.length()-1;i++)
		{
			if(S.charAt(i)==S.charAt(i+1))
			{
				count++;
			}
			else
			{
				System.out.print(S.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(S.charAt(S.length()-1)+""+count);

	}

}
