package Java8;

import java.util.function.Predicate;

public class Lambdaperdicatedemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,10,15,20,25,30,35,40};

Predicate<Integer>p1=i->i%2==0;

Predicate<Integer>p2=i->i>50;

System.out.println("following are number even and greater than 50");

for(int n:a)
{
	if(p1.test(n)&&p2.test(n))
	{
		System.out.println(n);
	}
}

	}

}
