package Interface;

interface example{
	 int a=10;//by default variable is static and final
	 void display();//abstract method
}


public class Interfaceexample implements example{
	
	public void display()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceexample ie=new Interfaceexample();
		ie.display();
	}

}
