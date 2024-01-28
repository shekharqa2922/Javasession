package Constructor;
//this :this keyowrd can reference of current object
public class thiskeyword {
	
		
		int a;
		int b;
		double d;
		
		thiskeyword()//first
		{
			a=1;
			b=2;
			double d=25;
			
			
		}
		
		thiskeyword(int a,int b)//second
		{
			this.a=a;
			this.b=b;
			System.out.println(a+b);
			
		}
		thiskeyword(int x,double y)//third
		{
			a=x;
			d=y;
			System.out.println(a+d);
			
		}
		thiskeyword(int x,int y,double z)//fourth
		{
			a=x;
			b=y;
			d=z;
			System.out.println(a+d+z);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			thiskeyword co=new thiskeyword();//first
			thiskeyword co1=new thiskeyword(10,11);//second
			thiskeyword co2=new thiskeyword(10,11.5);//third
			thiskeyword co3=new thiskeyword(10,10,11.5);//fourth
		}

	}
	


