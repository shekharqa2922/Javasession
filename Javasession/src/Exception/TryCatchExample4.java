package Exception;

public class TryCatchExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  
        {  
        int data=50/0; //may throw exception   
        }  
            // handling the exception by using Exception class      
        catch(Exception e)  
        {  
        	System.out.println("Can't divided by zero");  
        }  
       
    
	}

}
