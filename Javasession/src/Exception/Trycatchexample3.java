package Exception;

public class Trycatchexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int val=10/0;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException ae)//its already unreachable to arithmaticexception because we aready defined first catch block
		{
			System.out.println(ae);
		}
	}

}
