package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class EmpCamaparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Emps>al=new ArrayList<Emps>();
al.add(new Emps("shekhar",50));
al.add(new Emps("sameer",60));

Collections.sort(al,new Camparator());
{
	for(Emps e:al)
	{
		System.out.println(e.name +" " +e.age);
	}
}
	}

}
