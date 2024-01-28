package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylistexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("u");
		al.add("h");
		al.add("i");
		
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println("After removing :" +al2);
		
		//sort-collections .sort()
		
		System.out.println("Element in the arraylist:"+al);
		Collections.sort(al);
		System.out.println("Element in the array is sorted:" +al);
		
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println("Element in the array list sorting in reverse order" +al);
		
		//shuffle -collection -shuffle();
		
		Collections.shuffle(al);
		System.out.println("Element is the arraylist shuffling" +al);
		
		//converting string array into arraylist
		
		String arr[]= {"Dog","Cat","Elephant"};
				for(String value:arr)
				{
					System.out.println(value);
				}
				
				ArrayList al3=new ArrayList(Arrays.asList(arr));
				System.out.println(al3);
				
	}

}
