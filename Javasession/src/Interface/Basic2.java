package Interface;


interface examplenew
{
	int a=10;
	void display();
	
}

public class Basic2 implements examplenew {

	public void display()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Basic2 be=new Basic2();
be.display();

	}

}
