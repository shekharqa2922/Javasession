package Inheritance;


	/* Inheritance
	 * one class can aquries the variable and method from another class called inheritances
	 * This is using keyword extend
	 * Below example is single inheritance
	 * 
	 * Type of Inheritance
	 * 1. single
	 * 2.Multi level
	 * Multiple inheritance(can not achieve using class)
	 * 4.Hirarachial
	 * 5.Hybrid
	 */
	 class car
	{
	
		String carmodel;
		int carcost;
		
		public void carmodel()
		{
			System.out.println("this is how to start car model start:"+carmodel);
		}
		public void carcost()
		{
			System.out.println("this is how to carcost :"+carcost);
		}
		
	}
	 class Benz extends car
	{
		String door;
		int doorcost;
		
		public void displaydoor()
		{
			System.out.println("this is door name is :"+door);
		}
		public void displaydoorcosrt()
		{
			System.out.println("this is door cost of benz:" +doorcost);
		}
	}
		
	public class BasicInheritance {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Benz be=new Benz();
		be.carmodel="MAHINDRA";
		be.carcost=20000;
		be.door="italian";
		be.doorcost=10000;
		be.carcost();
		be.carmodel();
		be.displaydoor();
		be.displaydoorcosrt();
		
		
	}
		}

