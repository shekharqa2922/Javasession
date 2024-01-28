package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Array limitation
 * 1 fixed in size
 * 2.can hold same data type element
 * Arraylist --Arraylist is a datastructure in java
 * Arraylist has not limit
 * we can also store any kind of datatype
 * 
 * INT A[]=NEW INT[5];
 * nOTATION 1
 * ArrayList al=new ArrayList(); //allow all data type elements
 * Notation 2
 * ArrayList <String> al=new ArrayList<String>)(); //allow only string type data elements
 * ArrayList <Integer>al=new ArrayList<Interger>(); //allows only integer type elements
 */
public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String>al=new ArrayList<String>();
		//adding element in arraylist
		
		al.add("Shekhar");
		al.add("sayali");
		al.add("pillu");
		
		System.out.println(al.size());
		
		for (String s:al)
		{
			System.out.println(s);
		}
		
		ArrayList <Integer> ai=new  ArrayList <Integer>();
		ai.add(89);
		ai.add(101);
		ai.add(101);
		
		System.out.println(ai.size());
		for(Integer k:ai)
		{
			System.out.println(k);
		}
		
		ArrayList <Integer> all=new  ArrayList <Integer>();
		all.add(10);
		all.add(20);
		all.add(30);
		
Iterator it=all.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());//printing the element and move to next
		}
		
	
	}

}
