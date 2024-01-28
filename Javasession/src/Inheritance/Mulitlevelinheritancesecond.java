package Inheritance;


class Insuitude
{
	String coursename="java";
	static String classromename="Java classrom";
	int factolynumber=1;
	static String institudename="AI technology";
}

class coursedetilds extends Insuitude
{
	String factulyname="shekhar nanaware";
	void coursedisplay()
	{
		System.out.println(factulyname);
		System.out.println(coursename);
	}
	
}
class roomdetails extends coursedetilds
{
	 static void displayclassromm()
	{
		System.out.println(institudename);
		System.out.println(classromename);
	}
}
public class Mulitlevelinheritancesecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roomdetails rs=new roomdetails();
		rs.displayclassromm();
		rs.coursedisplay();
		rs.coursedisplay();
	}

}
