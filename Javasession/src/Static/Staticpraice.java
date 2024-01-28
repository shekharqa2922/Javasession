package Static;

public class Staticpraice {
	int a=10;
	static int b=20;
	
	static void m1()
	{
		System.out.println("m1 is static method:" +b);
	}

	
	void m2()
	{
		System.out.println("m2 is non static method:" +a);
	}
	
	void m3()
	{
		System.out.println("b can access but through object creation:" +b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staticpraice s=new Staticpraice();
		m1();
		s.m2();
		s.m3();
	}		

}
