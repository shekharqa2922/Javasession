package String;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//split: we can split the given text into different parts
		String a="Shekhar Nanaware is working in the tcs";
		
		String []b=a.split(" ");
		
		for(String temp:b)
		{
			System.out.println(temp);
		}
	}
	

}
