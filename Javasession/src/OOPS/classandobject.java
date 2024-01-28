package OOPS;

public class classandobject {
       int empid;
		String empname;
		int salary;
		String deptnumber;
		
		public void display()
		{
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(salary);
			System.out.println(deptnumber);
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classandobject emp1=new classandobject();//1st ermployee
		emp1.empid=100;
		emp1.empname="Akshay";
		emp1.salary=20000;
		emp1.deptnumber="10";
		emp1.display();
		
		classandobject emp2=new classandobject();
		emp2.empid=200;
		emp2.empname="nayantara";
		emp2.salary=30000;
		emp2.deptnumber="10";
		emp2.display();
		
		classandobject obj=new classandobject();
		obj.empid=200;
		obj.empname="Akshata";
		obj.salary=30000;
		obj.deptnumber="2";
		obj.display();
	}

}
