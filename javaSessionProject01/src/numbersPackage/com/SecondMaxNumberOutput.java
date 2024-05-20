package numbersPackage.com;

public class SecondMaxNumberOutput {
	
		    public static void main(String[]args)
	    {
	        int a[]={5,6,9,8,2,3};
	    int Fmax=a[0];
	    int SecMax=a[1];
	    
	    if(a[0]>a[1]){
	        Fmax = a[0];
	        SecMax = a[1];
	    }
	    else{
	        Fmax=a[1];
	        SecMax = a[0];
	    }
	    
	    for(int i = 2; i<a.length; i++){
	        if(a[i]>SecMax){
	           // SecMax = Fmax;
	            //Fmax = a[i];
	        	SecMax = a[i];
	        }
	        /*else{
	            SecMax = a[i];
	        }*/
	    
	    }
	    //System.out.println(Fmax);
	    System.out.println(SecMax);
	    }

}
