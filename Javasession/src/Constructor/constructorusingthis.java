package Constructor;

public class constructorusingthis {

	
		// TODO Auto-generated method stub
		int a;
		int b;
		float t,r;
		double p;
		constructorusingthis()
		{
			int a=10;
		int b=5;
			System.out.println(a-b);
		}
		constructorusingthis(int a,int b)
		{
			this.a=a;
			this.b=b;
			System.out.println(a+b);
		}
		constructorusingthis(int a,int b,double p)
		{
			this.a=a;
			this.b=b;
			this.p=p;
		
			System.out.println(a+b+p);
		}
		constructorusingthis(float d,float e,double h)
		{
			t=d;
			r=e;
			p=h;
			System.out.println(t+d-p);
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			constructorusingthis ca=new constructorusingthis();
			constructorusingthis ca1=new constructorusingthis(20,10);
			constructorusingthis ca2=new constructorusingthis(30,15,22.15);
			constructorusingthis ca3=new constructorusingthis(100,35,20.5);
		}
	}


