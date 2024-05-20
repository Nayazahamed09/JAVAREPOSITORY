package pattrenPrograms.com;

public class AssignmentProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="aababbc";  
		
		/*aa
		 * b
		 * a
		 * bb
		 * c
		 */
		char[]a=S.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]);
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.println(a[i]+" ");
		}
		
		
		

	}

}
