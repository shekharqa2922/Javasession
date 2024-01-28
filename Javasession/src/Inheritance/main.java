package Inheritance;


class Parent
{
	String name="parent";
	String message()
	{
		return "from parent";
	}
}
class child extends Parent
{
	String name="child";
	String message()
	{
		return "from child";
		
	}
}

public class main {

	public static void main(String[] args) 
	{
		
		Parent p=new child();
System.out.println(p.name + " " + p.message());
	}

}
