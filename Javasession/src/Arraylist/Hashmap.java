package Arraylist;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(100,"Akshay");//add to hastmap
		hm.put(200,"BAPU");
		hm.put(300,"Rahul"); 
		
		System.out.println(hm);
		
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(300);//remove 
		System.out.println(hm);

	}

	}


