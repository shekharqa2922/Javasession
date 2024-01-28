package String;

public class Stringbasicallinone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="shekhar nanaware";

s="Akshay";
System.out.println(s);
	


//String object(s) is immutable
//string s="shekhar nanaware" and we define s="akshay" then s will be overide but s="shekhar nanaware"
//will not non modify and non-changed it will not delete 
//but it will giv priority to second s=akshay

String a="Akshay";
System.out.println(a.length());
String b=" Akshay Bhumkar";
System.out.println(b.length());

System.out.println(b.replace('B', 'n'));
//split
String g="Akshay bhumkar worng in sydeny";

String []y=g.split(" ");

for(String temp:y)
{
	System.out.println(temp);
}

String p="   Shekhar    ";
System.out.println(p);
System.out.println(p.trim());//removed space

}
}
