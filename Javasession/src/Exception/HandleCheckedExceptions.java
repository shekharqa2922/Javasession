package Exception;

public class HandleCheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("program is started");
 System.out.println("program is in progress");
 try
 {
 Thread.sleep(4000);
 }
 catch(InterruptedException e)
 {
	 System.out.println(e.getMessage());
 }
 System.out.println("Program is completed");
 System.out.println("Program is exited");
	}

}
