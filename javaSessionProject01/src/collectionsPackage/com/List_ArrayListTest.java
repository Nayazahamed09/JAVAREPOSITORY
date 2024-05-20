package collectionsPackage.com;

import java.util.ArrayList;

public class List_ArrayListTest {

	public static void main(String[] args) 
	{
		ArrayList<Object>List=new ArrayList<Object>();
		List.add(10);
		List.add(null);
		List.add(null);
		List.add("Ravi");
		List.add(10.50);
		List.add("Hello java");
		System.out.println(List);
		
		ArrayList<Integer>List1=new ArrayList<Integer>();
		List1.add(10);
		List1.add(null);
		List1.add(1);
		System.out.println(List1);

	}

}
