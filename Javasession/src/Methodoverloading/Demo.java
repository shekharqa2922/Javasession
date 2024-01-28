package Methodoverloading;

interface Cartype
{
	public void displaycarmodel();
}

interface Car  extends Cartype
{
	public void cardmodel();
}

public class Demo implements Car {
	
	public void displaycarmodel()
	{
		System.out.println("This is suv");
	}
	
	public void cardmodel()
	{
		System.out.println("This is sedan");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Demo();
		c.displaycarmodel();
		
	}

}
