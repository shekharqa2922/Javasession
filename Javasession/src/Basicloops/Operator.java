package Basicloops;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=20;
		int j=4;
		//Arithmetic operator
		System.out.println(i-j);
		System.out.println(i+j);
		System.out.println(i/j);
		System.out.println(i*j);
		
		
		//logical operator given boolean value :true or false && || !
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		//Assignment operator
		int c;
		c=i;
		System.out.println(c);
		c=j;
		System.out.println(c);
		//increment operator
		int e=100;
		e++;
		System.out.println(e);
		//decrement operator
		int l=100;
		l--;
		System.out.println(l);
		
		
		//Java Unary Operator-prefix and postfix
		int p=10;  
		int k=10;  
		System.out.println(p++ + ++p);//10+12=22  
		System.out.println(k++ + k++);//10+11=21 
		
		//Java Unary Operator Example: ~ and !
		int a=10;  
		int b=-10;  
		boolean co=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!co);//false (opposite of boolean value)  
		System.out.println(!d);//true  
		
	}

}
