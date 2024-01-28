package AccessModifier;
/*
 * Acess modifier
 * 1.Public
 * private
 * default
 * protected
 * 
 * Private:it is used within a a class
 * default:accessibble only within a package
 * protected:accesibles with in the package with in package and out of package through inheritance
 * public:can be accessible everywhere
 */
class Institude
{
	private int institudecost;
	String Employee="Akshay";
	int emplyeesalary=2000;
	private void instidisplay()
	{
		System.out.println("Institude cost:"+institudecost);
		System.out.println("Name of employee: "+Employee);
		System.out.println("Salary of employee:"+emplyeesalary);
	}
}
class Employee extends Institude
{
	String employeerole="Teacher";
	void display()
	{
	System.out.println("Role of employee:" +employeerole);
}
}

public class Public {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eo=new Employee();
		// eo.instidisplay();//can not access since it is private method
		eo.display();
		Institude io=new Institude();
		//io.institudecost();//can not access since it is private method
		//io.institudecost=1000;//can not access since it is private
	}

}
