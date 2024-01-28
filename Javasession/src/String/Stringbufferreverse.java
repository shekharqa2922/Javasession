package String;

public class Stringbufferreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//replace() 
		StringBuffer str=new StringBuffer("Bapu Bhumkard");

		System.out.println(str.replace(5,112, "ambegoan"));
		
		//reverse:to reverse the text in given string literal text
		
		StringBuffer str2=new StringBuffer("Akshata Bhumkar");
		System.out.println(str2.reverse());
		
		//setcharat:to replace or set the given character in the string literal text at the given value
		
		StringBuffer n=new StringBuffer("jai shivkar");
		n.setCharAt(2,'y');
		System.out.println(n);//i is replace by y
		
		//setlenght():to set the size or length of stringbuffer object
		
		n.setLength(3);
		System.out.println(n);
		//substring:is used to return of text from given string text
		//n.substring(3);
		n.substring(0,2);
		System.out.println(n);
		//tostring:to convert object from stringbufferclass type to sting class
		
		String q=n.toString();
		System.out.println(q);
	}

}
