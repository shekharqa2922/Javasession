package Importantprogram;

public class fibanocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.println(n1+ " " +n2);
		
		for(int i=2;i<10;i++)
		{
			sum=n1+n2; //0+1=1, 1+1=2 1+2=3 3+2=5 5+3=8 
			System.out.println(" "+sum);//1 2 3 5 8
			n1=n2;//1 1 2 3 5
			n2=sum;//1 2 3 5 8
		}
		
	}

}
