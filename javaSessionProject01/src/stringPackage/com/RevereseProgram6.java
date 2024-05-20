package stringPackage.com;

public class RevereseProgram6 {

	public static void main(String[] args) 
	{
		String st="Hi Hello Welcome To";// To Hello Welcome Hi
		String[] k=st.split(" ");
		String temp=k[0];
		k[0]=k[k.length-1];
		k[k.length-1]=temp;
		for(int i=0;i<k.length;i++)
		{
			System.out.print(k[i]+" "); 
		}

	}

}
