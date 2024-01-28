package ThrowandThows;

public class TestThrow1 {
	
	public static void validate(int age) 
	{  
        if(age<18) 
        {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);  
       
	}

}
