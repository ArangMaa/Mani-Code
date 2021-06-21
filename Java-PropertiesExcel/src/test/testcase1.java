package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testcase1 {

	public static void main(String[] args) throws IOException {
		Properties pro= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\Config\\Object.properties");//this will accepet the path of your properties filr
		pro.load(fis);// load is a class in jaja and it will load the file
		System.out.println(pro.getProperty("name"));//it will read the properties file and it will provide the value of the key we want
		System.out.println(pro.getProperty("age"));
		System.out.println(pro.getProperty("salary"));
		System.out.println(System.getProperty("user.dir"));//it will give me current directry of the current project
	}	

}
