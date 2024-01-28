package OOPS;

public class variableaccessingwithmethod {
	
	int empid;
	int edep;
	String ename;
	String ecollge;
	
	public void collegedata(int empnumber,int edepartment,String employeename,String collge)
	{
		empid=empnumber;
		edep=edepartment;
		ename=employeename;
		ecollge=collge;
		
		
	}
	
	public void display()
	{
		System.out.println("Print the employeenumber:"+empid);
		System.out.println("Print the department:" +edep);
		System.out.println("Print the name:" +ename);
		System.out.println("Print the ecollge" +ecollge);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variableaccessingwithmethod va=new variableaccessingwithmethod();
		va.collegedata(10, 20, "akshay", "jspm");
		va.display();
	}

}
