package Constructor;

class Vehicle
{
	int maxspeed=200;
	
}
class car extends Vehicle
{
	int maxspeed=220;
	 void display()
	 {
		 System.out.println("maximum speed:" +super.maxspeed);
	 }
}
public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 car c=new car();
 c.display();
	}

}
