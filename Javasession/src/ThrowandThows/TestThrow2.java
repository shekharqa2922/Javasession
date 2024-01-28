package ThrowandThows;
class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  
public class TestThrow2 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{  
	        try  
	        {  
	            // throw an object of user defined exception  
	            throw new UserDefinedException("This is user-defined exception");  
	        }  
	        catch (UserDefinedException ude)  
	        {  
	            System.out.println("Caught the exception");  
	            // Print the message from MyException object  
	            System.out.println(ude.getMessage());  
	        }  
		}
	}
