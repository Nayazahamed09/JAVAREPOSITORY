package numbersPackage.com;

public class PrintConsecutiveNumbers {
	
public static void main(String[] args) {
	
	//String Number="12346789";
	
	String s="123645978";
	
	String s1="";
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i+1)-s.charAt(i)==1) {
			s1=s1+s.charAt(i)+s.charAt(i+1);
		}
	}
	System.out.println(s1);
//	for(int i=0;i<Number.length()-1;i++)
//	{
//		if(Number.charAt(i+1)-Number.charAt(i)==1)
//		{
//			if(s1.length()==0) {
//				s1=s1+Number.charAt(i)+Number.charAt(i+1);
//			}
//			else {
//				s1=s1+Number.charAt(i+1);
//			}
//		}
//		else {
//			System.out.println(s1);
//			s1="";
//		}
//	}
//	System.out.println(s1);
	
	
	
}

}
