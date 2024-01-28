package OOPS;

public class returnvaluenew {
int a;
int b;
 

int sum()
{
	return (a+b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnvaluenew r=new returnvaluenew();
		r.a=10;
		r.b=20;
		int c=r.sum();
		System.out.println(c);
	}

}
