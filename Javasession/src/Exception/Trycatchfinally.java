package Exception;
/*Exception occurs,catch block handles,finally block also execute
 * 
 */
public class Trycatchfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]	=new int[5];
		
		try {
			b[4]=100;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this is finally block");
		}
				
	
	}
	

}
