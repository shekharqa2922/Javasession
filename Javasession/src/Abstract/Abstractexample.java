package Abstract;
/*
 Abstract class in Java
A class which is declared as abstract is known as an abstract class. 
It can have abstract and non-abstract methods. 
It needs to be extended and its method implemented. 
It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 */

abstract class Bike
{
	abstract void run();
}
public class Abstractexample extends Bike {
	
	void run()
	{
		System.out.println("running saftey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Abstractexample();
		obj.run();
	}

}
