package Methodoverloading;
//Method Overlaoding:A class contains more than one method with the same name is called method overloading
	/*Method Overlaoding need below 3 cateria Method overloading:Method name is same but with differnet parameter
	 1.Number of parameter
	2. Order of parameter
	3.data type of parameter
	*/
	
public class Overloading {
	
	
	int sid;
	int dno;
	float studentid;
	String coursename;
	String lang;
	public void m1()//data type of parameter
	{
		
		System.out.println("All info related to collge");
	}
	public void m1(int sid,int dno)
	{
		System.out.println("Studnet id "+sid) ;
		System.out.println("Department no" +dno);
	}
	public void m1(int sid,int dno,String onlinecoursename)
	{
		System.out.println(sid+dno+onlinecoursename);
	}
	public void m1(int sid,int dno,String onlinecoursename,String lang)
	{
		System.out.println(sid+dno+onlinecoursename+lang);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Overloading oo=new Overloading();
		oo.m1(2, 4);
		oo.m1(2, 1);
		oo.m1(2, 4, "computer");
		oo.m1(2, 1, "computer", "digital");
		
		
		 
	
		
	}

}
