package OOPS;

public class Methodnotakeparatmer {
	int a;
	 int b;
	 int c;
	 int d;
	  void sum()//method without taking the paramter and method may not retun value
	 
	 {
		System.out.println(a+b);
	 }
	  void minus()
	  {
		  System.out.println(c-d);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodnotakeparatmer s=new Methodnotakeparatmer();
		s.a=10;
		s.b=20;
		s.sum();
		s.c=30;
		s.d=10;
		s.minus();
	}

}
