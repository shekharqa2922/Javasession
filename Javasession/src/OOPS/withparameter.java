package OOPS;

public class withparameter {

	
	int a;
	int b;
	
	public void display(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withparameter w=new withparameter();
		w.display(20, 10);
	}

}
