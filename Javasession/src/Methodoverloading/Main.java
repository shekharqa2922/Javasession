package Methodoverloading;

class SubtractionTest1 {
	 
    public void subtraction1(int num1, int num2) {
        System.out.println("Inside super class method");
        System.out.println(num1 - num2);
    }
 
 }
 
public class Main extends SubtractionTest1
{
 
    public void subtraction1(int num1, int num2) {
        System.out.println("Inside sub class method");
        System.out.println(num1 - num2);
    }
 
	public static void main(String[] args) {
		Main main = new Main();
		main.subtraction1(200, 100);
		
	}
}