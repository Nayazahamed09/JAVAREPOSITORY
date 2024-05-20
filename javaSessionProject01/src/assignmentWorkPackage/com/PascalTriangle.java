package assignmentWorkPackage.com;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) 
	{
		ArrayList<Integer>arr1=new ArrayList<Integer>();
		ArrayList<Integer>arr2=new ArrayList<Integer>();
		int n=0;
		int space=5;
		int number=6;
		
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("- ");
			}
			space=space-1;
			for(int k=0;k<=n;k++)
			{
				if(k==0)
				{
					System.out.print(1);
					arr2.add(1);
				}
				else if(k==n)
				{
					System.out.print(1);
					arr2.add(1);
				}
				else
				{
					if(k%2==1)
					{
						System.out.print(" ");
						arr2.add(0);
					}
					else
					{
					int	y=arr1.get(k)+arr1.get(k-2);
					System.out.print(y);
					arr2.add(y);
					}
				}
				
			}
			arr1.clear();
			arr1.addAll(arr2);
			//System.out.println(arr2);
			arr2.clear();
			n=n+2;
			System.out.println();
		}
		
		
	}
	}


