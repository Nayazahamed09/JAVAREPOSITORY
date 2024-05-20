package arrayspackage.com;

public class ReverseTheArrayUptoParticularPosition {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int length=arr.length;
		int reversePosition=5;
		
		if(reversePosition>length)
		{
			System.out.println("Invalid Range");
		}
		for(int i=0;i<reversePosition/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[reversePosition-i-1];
			arr[reversePosition-i-1]=temp;
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]+" ");
		}
	}

}
