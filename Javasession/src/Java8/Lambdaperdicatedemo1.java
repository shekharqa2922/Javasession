package Java8;

import java.util.function.Predicate;

public class Lambdaperdicatedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate <Integer>p=i->(i>10);
		
		System.out.println(p.test(20));//true
		System.out.println(p.test(5));//false
	}

}
