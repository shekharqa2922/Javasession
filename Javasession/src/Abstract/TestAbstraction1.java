package Abstract;


abstract class shape
{
	abstract void draw();
}

class Rectangle extends shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class Circle extends shape
{
	void draw() {
		System.out.println("drawing circle");
	}
}
public class TestAbstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape s=new Circle();
s.draw();


	}

}
