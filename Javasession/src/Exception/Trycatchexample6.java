package Exception;

public class Trycatchexample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	args=null;
	args[0]="test";
	System.out.println(args[0]);
}
catch(Exception ex)
{
	System.out.println("Exception");
}
catch(NullPointerException npe)
{
	System.out.println("NullpointerException");
}

	}

}
