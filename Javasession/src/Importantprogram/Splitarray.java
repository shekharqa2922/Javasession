package Importantprogram;

public class Splitarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Shekhar @s";

String []arraysplit=s.split("@",2);

for(String a:arraysplit)
	System.out.println(a);
	}


}
