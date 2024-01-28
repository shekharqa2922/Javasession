package Interface;


interface organisation
{
	String orgnname="global";
	void displayorganisation();
	
}
interface employee
{
	int salary=1000000;
	void displaysalary();
}
public class Multipleinterfacebyusinginterface 
implements organisation,employee
{
public void displayorganisation()
{
	System.out.println(orgnname);
	
}
public void displaysalary()
{
	System.out.println(salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinterfacebyusinginterface m=new Multipleinterfacebyusinginterface();
		m.displayorganisation();
		m.displaysalary();
	}

}
