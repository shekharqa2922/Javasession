package Importantprogram;

public class Revesestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello world";
String revstring=" ";
//int len=str.length();
for(int i=str.length()-1;i>=0;i--)
{
	revstring =revstring+str.charAt(i);
}
System.out.println(revstring);
	}

}
