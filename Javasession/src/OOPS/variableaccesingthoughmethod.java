package OOPS;

public class variableaccesingthoughmethod {
	int empid;
	String empname;
	int salary;
	int deptnumber;
	
	//constructor:constructor is speical kind of method same as classname
	
	public void setdata(int id,String ename,int sal,int dept)
	{
		empid=id;
		empname=ename;
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
	
	public static void main(String[] args) 
	{
		variableaccesingthoughmethod b=new variableaccesingthoughmethod();
		b.setdata(1, "shekhar",10000,2);
		b.display();
		variableaccesingthoughmethod ba=new variableaccesingthoughmethod();
		ba.setdata(2, "sayali",20000,3);
		b.display();
		

	}
}