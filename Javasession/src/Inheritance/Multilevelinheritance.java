package Inheritance;
/* Inheritance
 * one class can aquries the variable and method from another class called inheritances
 * This is using keyword extend
 * Below example is Multiple inheritance
 */

class Insutitue
{
	String coursename="Java";
	String classroom="New java classromm";
	int factultyno=1;
	String Insutituename="Madhukar AI tech";
	
	void displayinstitudename()
	{
		System.out.println("the indias first tech insuitude:" +Insutituename);
	}
}

class course extends Insutitue
{
	String factultyname="nanaware sir";
	void displaycourse()
	{
		System.out.println("World gretest teacher:" +factultyname);
		System.out.println("will teach to student:" +coursename);
	}
}
class room extends course
{
	void displayclassroomname()
	{
		System.out.println("class roomname is:" +classroom);
		System.out.println("class room factlyno is:"+factultyno);
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		room ro=new room();
		ro.displayinstitudename();
		ro.displaycourse();
		ro.displayclassroomname();
		
		
		
	}

}
