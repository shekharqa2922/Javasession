package String;

public class indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//index of :we can check whether the give text or chaacter is availble in the string literal
		
		String a="is Shekhar Nanaware is working in the tcs";
		System.out.println(a.indexOf("Nanaware"));
	System.out.println(a.indexOf("deepika", 15));//we dont et because deepika we didnt mentonin literal
	
	//lastindexof():to check the last occurance of given text or character in the provided string literal
	System.out.println(a.lastIndexOf("is"));
	System.out.println(a.lastIndexOf("is", 20));
	}
	
	
	

}
