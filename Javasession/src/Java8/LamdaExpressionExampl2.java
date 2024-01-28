package Java8;

@FunctionalInterface
interface Cab1
{
	public void bookcab(String source, String destination);
}


public class LamdaExpressionExampl2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cab1 cab=( source,  destination)->System.out.println("ola cab is booked from " +source +" To "+ destination);
		//return ("Price :5000 RS");
	cab.bookcab("pune", "sasawad");
	
		
	}

}
