package Inheritance;
/*Method overlading
 * Refine the same method from parent class into child class
 * Method overloading vs/Method overriding
 * ----------------------------
 * Overloading                                       Overriding
 * no inheritance is required                    atleast we should have 2 classes(parent 1 and 1 is child)
 * definition should not same(means parameter)    definition should be same but body can be changed
 * override 
 * class a{
 * void display(int x,int y)
 * {
 * }
 * class b
 * void display(int x,int y)
 * {
 * }
 * 
 */

class RBI
{
	int getintersect()
	{
		
		return 4;
	}
}

class SBI extends RBI
{
	int getintersect()
	{
	return 8;
	}
}
class union extends RBI
{
	int getintersect()
	{
	return 10;
	}
}

public class Methodoverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rb=new RBI();
		System.out.println("this is rbi intersect rate:" +rb.getintersect());
		union uo=new union();
		System.out.println("this is union intersect rate:"+uo.getintersect());
		SBI sb=new SBI();
		System.out.println("this is sbi intersect rate:"+sb.getintersect());
		
	}

}
