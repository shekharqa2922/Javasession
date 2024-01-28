package Constructor;

public class Constructorsuportoverloading 
{
	
	int a;
	int b;
	float t,r;
	double p;
	Constructorsuportoverloading()
	{
		int a=10;
	int b=5;
		System.out.println(a-b);
	}
	Constructorsuportoverloading(int d,int e)
	{
		a=d;
		b=e;
		System.out.println(a-b);
	}
	Constructorsuportoverloading(float d,float e)
	{
		t=d;
		r=e;
		System.out.println(t-d);
	}
	Constructorsuportoverloading(float d,float e,double h)
	{
		t=d;
		r=e;
		p=h;
		System.out.println(t+d+p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorsuportoverloading ca=new Constructorsuportoverloading();
		Constructorsuportoverloading ca1=new Constructorsuportoverloading(20,10);
		Constructorsuportoverloading ca2=new Constructorsuportoverloading(30,15);
		Constructorsuportoverloading ca3=new Constructorsuportoverloading(100,35,20.5);
	}

}
