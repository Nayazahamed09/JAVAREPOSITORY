package stringPackage.com;

public class ReverseTheStringInSpace {
	
	 public static void main(String[] args)
	    {
	      String s="I love Tyss";
	      String s1=s.replace(" ","");
	      for(int i=0,j=s1.length()-1;i<s.length();i++)
	      {
	          if(s.charAt(i)!=' ')
	          {
	              System.out.print(s1.charAt(j--));
	          }
	          else
	          {
	              System.out.print(s.charAt(i));
	          }
	      }
	      
	    }

}
