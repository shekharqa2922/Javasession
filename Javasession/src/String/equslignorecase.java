package String;

public class equslignorecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//equalignorecase it used compare two literals and ignore the case when they are compare
		//euqalignore is not case sensetive
		
		String a="Shekhar";
		String b="shekhar";
		
		System.out.println(a.equals(b));//false
		System.out.println(a.equalsIgnoreCase(b));//true
		 
	}

}
