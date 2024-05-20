package stringPackage.com;

public class CountNumberOfVowelsIntheString {

	public static void main(String[] args) {
		
		String S="Himalayas";
		int count=0;
		for(int i=0;i<S.length();i++)
		{
			if((S.charAt(i)=='a')||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
			{
				count++;
				System.out.println(S.charAt(i)+" "+count);
			}
			
				//System.out.print(count);
			
			

	}

}
}
