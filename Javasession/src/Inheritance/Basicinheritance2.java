package Inheritance;



class school
{
	String schoolname;
	int schoolcost;
	
	public void schoolfee()
	{
		System.out.println(schoolcost);
		System.out.println(schoolname);
	}
}
class dress extends school
{
	String dressname;
	int dresscost;
	public void dressdisplay()
	{
		System.out.println(dressname);
		System.out.println(dresscost);
	}
	
}

public class Basicinheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dress d=new dress();
d.dressname="akshata";
d.dresscost=2000;
d.dressdisplay();
d.schoolname="hdfc";
d.schoolcost=1000;
d.schoolfee();
	}

}
