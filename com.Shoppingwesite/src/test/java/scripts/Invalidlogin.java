package scripts;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.Homepage;
import pages.Loginpage;

public class Invalidlogin extends Basetest {
	@Test
	public void invalid() {
		
		Utilies u=new Utilies();
		u.implicitywait(driver);
		Loginpage l=new Loginpage(driver);
		Homepage h = l.enteremail(Propertyfile.getdata("emai"));
	}

}
