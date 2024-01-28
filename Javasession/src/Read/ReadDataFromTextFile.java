package Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file=new File("D:\\SampleDirectory\\output.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}

}
