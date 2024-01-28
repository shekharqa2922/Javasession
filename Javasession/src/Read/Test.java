package Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("D:\\SampleDirectory\\output.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine()) != null)
		{
			System.out.println(str);
		}
		br.close();
		
	}

}

