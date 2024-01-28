package Final;
/* final keyword
 * we can declare final to variable,method and class
 * final int a=10; //the value of variable is constant(we can not change)
 * final void m1() //method can not override in child class
 * final class // clas can not extended means can not aquire the properties variable and method
 */

final class Empolyee
{
	final String employeename="Shekhar";
	final int empid=10;
	
	final void  display()
	{
		System.out.println("Employee name: "+employeename);
		System.out.println("Employee id:"+empid);
	}
}

/*class student //extends Empolyee //final class can not be extended
{
	String studentname="Akshay";
	
	void display() //not valid bcoz display is final method
	{
		System.out.println("dispaly is overriden:"+studentname);
	}
}*/
public class finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empolyee eo=new Empolyee();
		eo.display();
		
	}

}
