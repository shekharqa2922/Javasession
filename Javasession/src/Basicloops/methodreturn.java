package Basicloops;

public class methodreturn {
	
	public static void methodc(int d,int b)//void is return type it will not return anything
	{
		int j=d+b;
		System.out.println(j);
		methodl(200,10);//nested method
		
	}
	public static int sum(int z,int x) //int  is return type it will not return anything
	{
		int sum=z+x;
		System.out.println(sum);
		return sum; //when return type is int,float or anything we need write the return 
	}
	
	public static String name() 
	{
		
		
		return "newlearing"; //when return type is int,float or anything we need write the return 
	}
	public static void methodl(int q,int w)//void is return type it will not return anything
	{
		int a=q-w;
		System.out.println(a);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
methodc(10,20);
sum(4000,19000);
String s=name();
System.out.println(s);

	}
	
}
