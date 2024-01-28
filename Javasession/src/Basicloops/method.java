package Basicloops;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodB();
		methodA(20);
		methodc(20,10);
		methodd(12.1,20);
	}
	
	public static void methodA(int a) //single parameterized method
	{
		System.out.println("inside we can call single parameter"+a);
	}
	public static void methodB()
	{
		System.out.println("inside no  parameter");
	}
	public static void methodc(int d,int b)
	{
		System.out.println("multi parameter :"+d+" "+b+"");
	}
	public static void methodd(double d,float b)
	{
		System.out.println("multi parameter :"+d+" "+b+"");
	}
}
