package String;

public class Stringbuffercharat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//charAt:Return the character literal in the given string literal text using the index value
		
		StringBuffer a=new StringBuffer("Mahi Todkar");
		System.out.println(a.charAt(5));//output-T
		
		//delete:to delete the text from given string literal text based on the index values
		StringBuffer m=new StringBuffer("Mahi Todkar");
		System.out.println(m.delete(5, 11));//output-Mahi
		//deletecharat:to delete the character in the string literal text at the given index value
		StringBuffer t=new StringBuffer("Mahi Todkar");
		System.out.println(t.deleteCharAt(5));//output-Mahi odkar
		
		//insert-to insert any text into the given sting literal at the given value
		StringBuffer abc=new StringBuffer("Mahi Todkar");
		System.out.println(abc.insert(4, " samir "));
		
		//length:return the size of length
		System.out.println(abc.length());
		
		//indexof:to check wheather the given  text is there in the string literal text or not 
	System.out.println(abc.indexOf("a"));//it will return index value of a-i.e. 1
	//lastindexof:to check whether the given text is available the given literal from the last
	System.out.println(abc.lastIndexOf("a"));
	
	
	
	
	}
	

}
