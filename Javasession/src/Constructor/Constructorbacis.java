package Constructor;

public class Constructorbacis {

	int empid;
	String empname;
	int salary;
	int deptnumber;
	
	 Constructorbacis(int id,String name,int sal,int dept)
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
		Constructorbacis ca=new Constructorbacis(1,"shekhar",20000,10);
		ca.display();
	}

}
