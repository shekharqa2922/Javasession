package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al=new ArrayList();
		al.add("Akshay");
		al.add("12");
		al.add(100.45); 
		al.add("Sydeny");
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(1);
		System.out.println("after removing element from arrayly list" +al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		
		al.set(2, "c#");
		System.out.println("after replacing "+al);
		
		System.out.println(al.contains("c#"));
		System.out.println(al.contains("c++"));
		System.out.println(al.isEmpty());
		
		//We can read value using below 3 method
		//for loop
		System.out.println("Reading elment using for for loops.....");
		
		for(int i=0;i<al.size();i++)
		{
			 System.out.println(al.get(i));
		}
		
		//for each loop
		System.out.println("Reading elment using for foreachloops.....");
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		//iterator
		System.out.println("Reading elment using iterator method.....");
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());//printing the element and move to next
		}
	}

}
