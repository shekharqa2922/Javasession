package ThrowandThows;

import java.io.IOException;

class M
{  
	
	 void college()throws IOException
	 {  
	  throw new IOException("device error");  
	 }  
	}  
public class Testthrows2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{  
		     M m=new M();  
		     m.college();  
		    }
		catch(Exception e)
		{
			System.out.println("exception handled");
			}     
		  
		    System.out.println("normal flow...");  
	}

}
