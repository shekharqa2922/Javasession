package Twodimentionalarray;

public class simpletwodimentionalarray1 {
//Two dimensional array is an array of single dimensional array
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a=new int[2][3];//int[][]a declaration // new int[2][3] creation
		
		a[0][0]=6;//intialise
		a[0][1]=1;
		a[0][2]=2;
		
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=8;
		
		System.out.println(a[0][0]);//access
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		
		
	}

}
