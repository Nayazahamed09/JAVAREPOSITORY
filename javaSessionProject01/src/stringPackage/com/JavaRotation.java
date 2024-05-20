package stringPackage.com;

public class JavaRotation {
	
	
	    public static void main(String[] args) {
	        String Word="Hello World This is Java";
	        
	        //olleH dlroW sihT si avaJ;
	     // java is This World Hello;
	        //avaj si sihT dlroW olleH;
	        String[] word=Word.split(" ");
	        System.out.print(Word);
	        System.out.println();
	        for(int i=0;i<word.length;i++)
	        {
	            String str=word[i];
	            for(int j=str.length()-1;j>=0;j--){
	                System.out.print(str.charAt(j));
	            }      
	           System.out.print(" ");
	        }
	        System.out.println();
	         for(int i=word.length-1;i>=0;i--)
	        {
	            String str=word[i];
	           System.out.print(str+" ");
	        }
	        System.out.println();
	         for(int i=word.length-1;i>=0;i--)
	        {
	            String str=word[i];
	            for(int j=str.length()-1;j>=0;j--){
	                System.out.print(str.charAt(j));
	            }      
	           System.out.print(" ");
	        }
	        
	        
	    }
	

}
