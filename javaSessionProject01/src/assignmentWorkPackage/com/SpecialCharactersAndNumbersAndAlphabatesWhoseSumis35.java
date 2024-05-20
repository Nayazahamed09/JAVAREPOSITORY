package assignmentWorkPackage.com;

public class SpecialCharactersAndNumbersAndAlphabatesWhoseSumis35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String M="a10@b20%5";
		
		int Sum=0;
		int tsum=0;
		for(int i=0;i<M.length();i++)
		{
			if(M.charAt(i)>='0' && M.charAt(i)<='9')
			{
				int n=M.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else
			{
				Sum=Sum+tsum;
				tsum=0;
			}
		}
		Sum=Sum+tsum;
		System.out.println(Sum);

	}

}
