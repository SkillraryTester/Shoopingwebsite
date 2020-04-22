package genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements Autoconstant{

	public static String getdata(String key)
	{
		String s="";
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyfilepath));
	  s = p.getProperty(key);
		}
		catch(Exception e)
		{
			Reporter.log("data is not taken",true);
		}
		return s;
		
	}
	
}
