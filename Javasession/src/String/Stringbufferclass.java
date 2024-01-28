package String;

public class Stringbufferclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//stingbuffer:it is mutable 
		StringBuffer s=new StringBuffer("shekhar");
		System.out.println(s);
		
		//Difference string class and stringbuffer
		//string class is immutable
		String a="Mahi";
		
		a.concat(" ").concat("Todkar");
		System.out.println(a);//output is mahi
		
		//stingbuffer:it is mutable 
		StringBuffer m=new StringBuffer("Mahi");
		m.append(" ").append("Todkar");
		System.out.println(m);
	}

}
