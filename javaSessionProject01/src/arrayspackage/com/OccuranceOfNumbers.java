package arrayspackage.com;

public class OccuranceOfNumbers {
	
public static void main(String[] args) {
        
        int [] s={1,2,3,4,5,6,7,7};
        boolean flag=false;
        
        for(int i=0;i<s.length;i++)
        {
            int count=0;
            for(int j=0;j<s.length;j++)
            {
                if(s[i]==s[j])
                {
                    if(i>j)
                    {
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
                
            }
            if(count>1)
            {
            	flag=true;
            	
            	if(flag==true)
            	{
            		System.out.println(s[i]);
            	}
            }
            
             
                            
            
        }
        if(flag==false)
        {
        	System.out.println(-1);
        }
        
       }

}
