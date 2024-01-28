package Propertyfile;

import java.util.Properties;

public class WritePropertiesfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Properties pro=new Properties();
		pro.setProperty("name", "akshay");
		pro.setProperty("email", "akshay@gmail.com");
		pro.setProperty("age", "35");
		
		String filePath=System.getProperty("user.dir");
	}

}
