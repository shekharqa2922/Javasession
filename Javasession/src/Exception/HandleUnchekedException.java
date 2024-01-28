package Exception;
/*
 * In try we write the exception
 * in catch we write the exactly which exception is need
 * in other words
 * 1 Exception occurs,catch block handles,finally block also execute
 * 2 Exception occurs,catch block not handles,finally block also execute
 * 3.Exception not occurs,catch block will ignore ,finally block  execute
 * 
 * There are two methods to handle exception
 * 1.try catch block (handling and unchecked exception)
 * 2.throws keyword
 *
 * 
 */
public class HandleUnchekedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started");
		
		int i=10;
		try
		{
			System.out.println(i/0);//Arithmatic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException b)
		{
			System.out.println(s);
		}
		System.out.println("program is in progress");
		System.out.println("program is stopped");
	}

}
