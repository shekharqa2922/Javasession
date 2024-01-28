package OOPS;

public class Varaibleaccessingthroughconstructor {

	int empid;
	String empname;
	int salary;
	int deptnumber;
	
	//constructor:constructor is speical kind of method same as classname
	Varaibleaccessingthroughconstructor(int id,String name,int sal,int dept)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptnumber=dept;
		
	}

	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptnumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Varaibleaccessingthroughconstructor v=new Varaibleaccessingthroughconstructor(1,"shekhar",20000,10);
		v.display();
		Varaibleaccessingthroughconstructor v1=new Varaibleaccessingthroughconstructor(2,"asha",30000,11);
		v1.display();
	}

}
