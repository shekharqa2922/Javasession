package Array;

public class Arrayindexoutofboxexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=5;
		a[3]=6;//we are try to giving 4th value then run program then expection will occure java.lang.ArrayIndexOutOfBoundsException
		System.out.println("value of first index:" + a[0]);
		System.out.println("value of first index:" +a[1]);
		System.out.println("value of first index:" +a[2]);
		System.out.println("value of first index:" +a[3]);//we are try to giving 4th value then run program then expection will occure java.lang.ArrayIndexOutOfBoundsException
	}

}
