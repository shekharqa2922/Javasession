package Array;

public class usingforloopswithsingledimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {10,20,30};//
		 
		System.out.println("size of array:" +a.length);//3 length
		
		for(int i=0;i<a.length;i++)// for loop i=0 // a[0]=10 // a.lenghth 0<3,a[1]=20 a.lenght1<2,a[2]=30,a.lenght2 <3,
			//a.lenght 4<3 it will fail
		{
			System.out.println("value of first index:" + a[i]);// a[0]=10,a[1]=20,a[2]=30
		}
		
		
	}

}


//a[i]=10,