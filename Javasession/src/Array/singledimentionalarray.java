package Array;

public class singledimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare ,create ,assign and access arrays
		int [] a=new int[5];
		//int [] a= {5,6,7,8,9}; // we can define like this
		//Declaration -int [] a and creation- new int[5] and a is the reference vairable
		//below is assign the value
		a[0]=5;
		a[1]=7;
		a[2]=8;
		a[3]=9;
		a[4]=4;
		
		//Access or retrive the assigned value
		
		System.out.println("value of first index:" + a[0]);
		System.out.println("value of first index:" +a[1]);
		System.out.println("value of first index:" +a[2]);
		System.out.println("value of first index:" +a[3]);
		System.out.println("value of first index:" + a[4]);
		
	}

}
