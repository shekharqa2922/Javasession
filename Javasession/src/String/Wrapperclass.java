package String;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wrapper classes:the primitive data type value into wrapper class objectS
		int a=9;
		Integer b=Integer.valueOf(a);//wrapping
		System.out.println(b);
		
		//unwrapping:Unwrapping in Java is the process of converting the Wrapper Class objects to the Primitive data type values.
		
		Integer i=Integer.valueOf(9);
		int n=i.intValue();//unwrapping
		System.out.println(n);
		

	}

}
