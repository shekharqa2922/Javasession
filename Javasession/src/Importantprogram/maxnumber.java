package Importantprogram;

public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {20,30,10,50};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
