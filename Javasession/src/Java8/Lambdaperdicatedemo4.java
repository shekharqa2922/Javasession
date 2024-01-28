package Java8;

import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int experience;
	


	Employee(String name,int sal,int exp)
{
	ename=name;
	salary=sal;
	experience=exp;
}
}
public class Lambdaperdicatedemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Akshay",80000,6);
		
		Predicate<Employee>pr=e->(e.salary>40000 && e.experience>3);
		System.out.println(pr.test(emp));
	}

}
