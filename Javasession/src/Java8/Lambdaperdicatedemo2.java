package Java8;

import java.util.function.Predicate;

public class Lambdaperdicatedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<String>pr=(s->s.length()>4);
System.out.println(pr.test("welcome"));//true
System.out.println(pr.test("xyz"));//false
	}

}
