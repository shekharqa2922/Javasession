package Methodoverloading;

public class SubtractionTest 
{
	int num1=500;
	int num2=200;
	public void subtraction()
	{
		System.out.println(num1 - num2);
	}
	public void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }
 
    public void subtraction(int num1, int num2, float num3) {
        System.out.println(num1 - num2 - num3);
    }
    
    public static void main(String[] args) 
	{
		
		SubtractionTest sb=new SubtractionTest();
		sb.subtraction();
		sb.subtraction(100, 50);
		sb.subtraction(100, 20, 10);
	
	}
}

