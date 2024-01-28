package Twodimentionalarray;

public class foreachloop {
//for each sepecially design for arrays and collections
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{6,3,8},{4,7,11,12}};
		
		for(int[] tempone:a)
		{
			for (int temptwo:a[0])
			{
				System.out.println(temptwo);
			}
		}
	}

}
