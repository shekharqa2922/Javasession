package Java8;

@FunctionalInterface
interface Cab
{
	public void bookcab();
}



public class LamdaExpressionExampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cab o=()->System.out.println("ola is cab for booking....");
		o.bookcab();
	}

}
