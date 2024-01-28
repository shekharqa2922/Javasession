package Exception;

public class Trycatchexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Program is started");
		
		int i=10;
		
		try
		{
			System.out.println(i/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Program is closed");
		}
	}

}
