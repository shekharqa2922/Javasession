package OOPS;

public class Methodtakeparameter {
	int a;
	 int b;
	int c;
	 int d;
	 public void sum(int x,int y)//method taking parameter
	 
	 {
		 a=x;
		 b=y;
		 System.out.println(x+y);
	 }
	 public void multiplication(int g,int j)
	 {
		// c=g;
		 //d=j;
		 System.out.println(g*j);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodtakeparameter s=new Methodtakeparameter();
		s.sum(10,20);
		s.multiplication(2, 3);
 
	}

}
