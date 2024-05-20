package stringPackage.com;

import java.util.*;

public class ConsonantsProgram {
	
public static void main(String[] args) {
        
        //int a[]={2,5,6,2,9,2,9,7,2,5,4};
        String word="Test Yantra Software Solutions"; // t-4,s-2 n-2, r-2
        String output=word.replace(" ","");
        //int count=0;
        
       LinkedHashSet<Character>set=new LinkedHashSet<Character>();
       
       for(int i=0;i<output.length();i++)
       {
    	   set.add(output.charAt(i));
            
                
                
            
        }
       int count=0;
       for(Character Word:set)
       {
    	   if(!(Word>='A'&& Word<='Z') && (Word!='a'&&Word!='e'&&Word!='i'&&Word!='o'&&Word!='u'))
    	   {
    		   count++;
    		   System.out.println(Word+"---> "+count);
    	   }
    	  // System.out.println(Word+" "+count);
    			   
    		   
    		   
    		   
    			   
       }
       //System.out.println(count);
    

}
}
