package Importantprogram;

public class Maxnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {30,40,50,60};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)//1<4 2<4 3<4 4<4
		{
			if(a[i]> max)//40>30 50>40 50>60
			{
				max=a[i];//40 50 60
			}
		}
		System.out.println("maximum element is array is :"+max);
	
	
	
	int b[]={20,10,30,5};
	
	int minvalue=b[0];
	
	for(int y=1;y<b.length;y++)
	{
		if(b[y]<minvalue)
		{
			minvalue=b[y];
		}
	}
	System.out.println("maximum element is array is :"+minvalue);

}
}