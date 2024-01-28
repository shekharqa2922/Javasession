package Interface;


interface organisationnew
{
	String neworgname="global";
	void displayorganisation();
}

interface employeenew
{
	int salary=200000;
	void displaynewsalary();
}
public class Multipleinterfacebyinterface implements organisationnew, employeenew
{
public void displayorganisation()
{
	System.out.println(neworgname);
}
public void displaynewsalary()
{
	System.out.println(salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinterfacebyinterface m=new Multipleinterfacebyinterface();
		m.displayorganisation();
		m.displaynewsalary();
		

	}

}
