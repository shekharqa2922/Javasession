package Abstract;


abstract class Bank
{
	abstract int getintersect();
}
 class sbi extends Bank
 {
	 int getintersect()
	 {
		 return 7;
	 }
 }
 
 class pnb extends Bank
 {
	 int getintersect()
	 {
		 return 8;
	 }
 }
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new sbi();
		b.getintersect();
		System.out.println("Rate of intersect is" +b.getintersect()+ "%");
		Bank p=new pnb();
		p.getintersect();
		System.out.println("Rate of intersect is" +p.getintersect()+ "%");
	}

}
