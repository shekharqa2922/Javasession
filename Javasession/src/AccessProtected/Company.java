package AccessProtected;

public class Company {

	protected String organisationname;
	protected String companypolicyname;
	
	protected void display()
	{
		System.out.println("Organisation name:"+organisationname);
		System.out.println("companypolicyname:"+companypolicyname);
	}
}
