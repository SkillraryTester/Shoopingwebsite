package genericlib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Takephoto {
	
	public void getphoto(WebDriver driver,String path,String name)
	{
		Date d=new Date();
		String a = d.toString().replaceAll(":","-");
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+name+".png");
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			Reporter.log("Photo is not taken",true);
		}
	}

}
