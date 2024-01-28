package Twodimentionalarray;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{6,3,8},{4,7,11,12}};
		
		System.out.println("size of array"+a[0].length);//2 number of row
		System.out.println("size of first array:"+ a[0].length);//3-correct
		System.out.println("size of second array:"+a[1].length);//4-correct
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			System.out.println(a[i][j]);
		}
	}

}
//remeber one thing first execute the outer for loop then i=0it will go inside for loop
//till nside for loop is not failed till it will execute j=0,2,3<3 when it fail till it wil execute i value
//then it will go to outerfor loops athen it will i=1 then   it will go inside for loop
//till nside for loop is not failed till it will execute j=0,2,3<3 when it fail till it wil execute i value
//then it will go to outerfor loops athen it will i=2 then i<a.length(2)  it will fail then it will execute