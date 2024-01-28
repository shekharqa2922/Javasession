package Java8;

import java.util.function.Predicate;

public class Lambdaperdicatedemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<String>pr=s->(s.length()>6);
String names[]= {"Akshata","Akshay","Bapusaheb","ujawala"};

for(String name:names)
{
	if(pr.test(name))
	{
		System.out.println(name);	
	}
	
}
	}

}
