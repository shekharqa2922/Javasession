package Exception;
/*Exception:Exception is an abnormal condition even which will terminate the program
 * 1 checked exception:this  exception identified by java complier
 * e.g. IoException,filenotfoundException,Interrupted Exception
 * 2. unchecked exception:this exception:this not identified by java complier
 * e.g.Arithamatic Exception,nullpoint exception,Numberformate exception etc
 * 
 * 
 * 
 */
public class Exceptionbasic {

	public static void main(String[] args) {
		
      
		int i=20;
		System.out.println(i/0);//ArithmeticException
		
		String s=null;
		System.out.println(s.length());//NullPointerException

		
		String name="shakira";
		int n=Integer.parseInt(name);//NumberFormatException
	System.out.println(n);
		
		int arr1[]=new int[5];
				 arr1[20]=20;

	int arr[]=new int[5];//ArrayIndexOutOfBoundsException
	arr[10]=100;
	
		
	}

}
