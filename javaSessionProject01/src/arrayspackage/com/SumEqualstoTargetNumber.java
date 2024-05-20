package arrayspackage.com;

import java.util.Scanner;
import java.util.*;

public class SumEqualstoTargetNumber {



	public static void main(String[] args) {
		
		int arr[]={2,4,6,8,9,1,7,3,5,5,4,6};
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the TargetSum :");
        int targetSum=s.nextInt();
        int sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            	if(arr[i]+arr[j]==targetSum)
            	{
            		if(!map.containsKey(arr[i])&&!map.containsValue(arr[i])) {
            		map.put(arr[i], arr[j]);
            		}
            	}
            
            }
        }
        System.out.println(map);
    }


	}


