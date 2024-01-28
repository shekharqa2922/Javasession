package Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file=new File("D:\\SampleDirectory\\output.txt");
		Scanner sc=new Scanner(file);
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

}
