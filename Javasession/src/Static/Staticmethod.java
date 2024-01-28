package Static;

public class Staticmethod {

	int a;
	static int b;
	
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
		b=1000;//static
		
		int j=100;//non static
		m1();//static method
		System.out.println("this is j value:"+j);
		System.out.println("this is static value in m3 method:"+b);
		System.out.println("this is m3 non static variable and static variable  method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static methods can access only access static stuff directly
		b=20;//we can declare variable value static
		//System.out.println("value in main classe:"+b);
		m1();//we can directly called m1 method
		//m2();is not static method so we need to intialize the class
		Staticmethod s=new Staticmethod();
		s.a=200;
		System.out.println(s.a);
		s.m2();//non static method can access everything
		s.m3();//non static method can access everything
	}

}
