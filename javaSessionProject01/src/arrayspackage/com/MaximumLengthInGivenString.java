package arrayspackage.com;

public class MaximumLengthInGivenString {

	public static void main(String[] args) {
		
		String []words= {"a","abc","abcd","abcde","abcdef","abcdefg","abcdefgh"};
		int maxLength=0;
		String maxLengthWord=words[0];
		for(int i=0;i<words.length;i++)
		{
			if(words.length>maxLength)
			{
				
				maxLengthWord=words[i];
				maxLength++;
				
			}
			
		}
		System.out.println(maxLengthWord+" "+maxLength);

	}

}
