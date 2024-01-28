package Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employeenew
{
	String ename;
	int salary;
	int experience;
	


	Employeenew(String name,int sal,int exp)
{
	ename=name;
	salary=sal;
	experience=exp;
}
}
public class Lambdaperdicatedemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Employeenew>pr=e->(e.salary>30000 & e.experience>2);	

ArrayList<Employeenew>al=new ArrayList<Employeenew>();
al.add(new Employeenew("Akshay",50000,5));
al.add(new Employeenew("Akshata",60000,3));
al.add(new Employeenew("Bapusaheb",40000,2));

for(Employeenew e:al)
{
	if(pr.test(e))
	{
		System.out.println(e.ename +" "+e.salary);
	}
}
	
	
	}

}
