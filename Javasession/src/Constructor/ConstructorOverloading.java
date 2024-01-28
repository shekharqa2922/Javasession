package Constructor;

/*Constructor is spical kind of method
 * Constructor name should same as classname
 * constructor will not return value
 * Constructor will be invoked at time object creating(we no need to call constructor explicity)
 * constuctor will take a parameter (just like method)
 * constructor is used for intilize the values */
public class ConstructorOverloading {
	
	int a;
	int b;
	double d;
	
	ConstructorOverloading()//first
	{
		a=10;
		b=20;
		double d=25;
		System.out.println(a*b);
		System.out.println(b-a);
		
	}
	
	ConstructorOverloading(int x,int y)//second
	{
		a=x;
		b=y;
		System.out.println(a+b);
		
	}
	ConstructorOverloading(int x,double y)//third
	{
		a=x;
		d=y;
		System.out.println(a+d);
		
	}
	ConstructorOverloading(int x,int y,double z)//fourth
	{
		a=x;
		b=y;
		d=z;
		System.out.println(a+d+z);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co=new ConstructorOverloading();//first
		ConstructorOverloading co1=new ConstructorOverloading(10,11);//second
		ConstructorOverloading co2=new ConstructorOverloading(10,11.5);//third
		ConstructorOverloading co3=new ConstructorOverloading(10,10,11.5);//fourth
	}

}
