package String;

public class boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//boxing :Boxing term is related to Wrapper Classes in Java.
//Boxing is the process of converting the values of primitive data types into the Wrapper Class objects in Java.
	
	
		int a=9;
		Integer b=Integer.valueOf(a);//wrapping
		System.out.println(b);
		//unwrapping 
		Integer i=new Integer(9);
		int kk=i.intValue();
		System.out.println(kk);
		
		//Auto-boxing
	
		int g=9;
		Integer gi=g;
		System.out.println(g);
		
		//Auto-unboxing
		
		Integer vv=new Integer(9);
		int ee=vv;
		System.out.println(ee);
	
	
	
	
	}	

}
