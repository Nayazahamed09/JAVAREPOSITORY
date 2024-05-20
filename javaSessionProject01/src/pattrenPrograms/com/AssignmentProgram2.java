package pattrenPrograms.com;

public class AssignmentProgram2 {

	public static void main(String[] args) {
		
		String S="Hi! He!llo Welc!ome !To"; // iH! ol!leH emoc!leW !oT
		String [] K=S.split(" ");
		for(int i=0;i<K.length;i++)
		{
			//System.out.println(K[i]+" ");
			String k=K[i];
			for(int j=k.length()-1;j>=0;j--)
			{
				System.out.print(k.charAt(j));
			}
			System.out.print(" ");
		}
		
			
	}
	

}
