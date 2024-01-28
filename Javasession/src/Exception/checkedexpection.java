package Exception;

public class checkedexpection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Program started");
		
		Thread.sleep(4000);//InterruptedException exception(checked exception)
		
		int i=10;
		System.out.println(i/0);//Arithmatic excpetion(unchecked exception)
		
		System.out.println("stopped");
		
		
	}

}
