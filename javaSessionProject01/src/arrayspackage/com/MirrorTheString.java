package arrayspackage.com;

public class MirrorTheString {

	public static void main(String[] args) {
		
		String word= "i am selenium";
        String broken=word.replace(" ","");
        String rev="";
        for(int i=0;i<word.length()-1;i++)
        {
            if(word.charAt(i)==' ')
            {
                System.out.print(" ");
            }
            else
            {
                rev=broken.charAt(i)+rev;
            }
        }
        System.out.print(rev);
		// TODO Auto-generated method stub

	}

}
