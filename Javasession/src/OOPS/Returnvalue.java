package OOPS;

public class Returnvalue {
	int a;
	 int b;
	 int c;
	 int d;
	 int sum()
	 {
		 return (a+b);
	 }
	 int division()
	 {
		 return (c/d);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returnvalue s=new Returnvalue();
		s.a=10;
		s.b=20;
		int r=s.sum();
		System.out.println(r);
		s.c=100;
		s.d=20;
		int rs=s.division();
		System.out.println(rs);
	}

}
